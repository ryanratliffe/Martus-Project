/*

The Martus(tm) free, social justice documentation and
monitoring software. Copyright (C) 2001-2007, Beneficent
Technology, Inc. (The Benetech Initiative).

Martus is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either
version 2 of the License, or (at your option) any later
version with the additions and exceptions described in the
accompanying Martus license file entitled "license.txt".

It is distributed WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, including warranties of fitness of purpose or
merchantability.  See the accompanying Martus License and
GPL license for more details on the required license terms
for this software.

You should have received a copy of the GNU General Public
License along with this program; if not, write to the Free
Software Foundation, Inc., 59 Temple Place - Suite 330,
Boston, MA 02111-1307, USA.

*/

package org.martus.client.swingui.tablemodels;

import org.martus.client.core.MartusApp;
import org.martus.common.MiniLocalization;

public abstract class RetrieveTableModelHQ extends RetrieveTableModel {

	public RetrieveTableModelHQ(MartusApp appToUse, MiniLocalization localizationToUse)
	{
		super(appToUse, localizationToUse);
		COLUMN_RETRIEVE_FLAG = columnCount++;
		COLUMN_TITLE = columnCount++;
		COLUMN_AUTHOR = columnCount++;
		COLUMN_LAST_DATE_SAVED = columnCount++;
		COLUMN_VERSION_NUMBER = columnCount++;
		COLUMN_BULLETIN_SIZE = columnCount++;
	}
}
