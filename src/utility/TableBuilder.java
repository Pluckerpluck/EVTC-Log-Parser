package utility;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TableBuilder {

	// Fields
	private String title = "";
	private List<String[]> rows = new LinkedList<String[]>();

	// Public Methods
	public void addTitle(String title) {
		this.title = title;
	}

	public void addRow(String... cols) {
		rows.add(cols);
	}

	public void clear() {
		title = "";
		rows = new LinkedList<String[]>();
	}

	// Private Methods
	private int[] getWidths() {
		int cols = 0;
		for (String[] row : rows)
			cols = Math.max(cols, row.length);
		int[] widths = new int[cols];
		for (String[] row : rows) {
			for (int i = 0; i < row.length; i++) {
				widths[i] = Math.max(widths[i], row[i].length());
			}
		}
		return widths;
	}

	private String center(String text, int len) {
		String out = String.format("%" + len + "s%s%" + len + "s", "", text, "");
		float start = (out.length() / 2) - (len / 2);
		return out.substring((int) start, (int) (start + len));
	}

	private String fill(int length, char charToFill) {
		if (length > 0) {
			char[] array = new char[length];
			Arrays.fill(array, charToFill);
			return new String(array);
		}
		return "";
	}

	// Public Methods
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		int[] colWidths = getWidths();
		// Title
		if (!title.equals("")) {
			str.append(fill(title.length(), '_') + "\n\n");
			str.append(title + "\n");
			str.append(fill(title.length(), '_') + "\n\n");
		}
		// Header
		for (int colNum = 0; colNum < rows.get(0).length; colNum++) {
			str.append(center(rows.get(0)[colNum], colWidths[colNum]));
			str.append("   ");
		}
		str.append("\n");
		for (int colNum = 0; colNum < rows.get(0).length; colNum++) {
			str.append(center(fill(colWidths[colNum], '_'), colWidths[colNum]));
			str.append("   ");
		}
		str.append("\n\n");
		// Body
		for (ListIterator<String[]> iter = rows.listIterator(1); iter.hasNext();) {
			String[] row = iter.next();
			for (int colNum = 0; colNum < row.length; colNum++) {
				str.append(center(row[colNum], colWidths[colNum]));
				str.append("   ");
			}
			str.append('\n');
		}
		return str.toString();
	}

}