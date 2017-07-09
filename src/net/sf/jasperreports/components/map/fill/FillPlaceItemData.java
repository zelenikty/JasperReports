/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2016 TIBCO Software Inc. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.components.map.fill;

import net.sf.jasperreports.components.items.Item;
import net.sf.jasperreports.components.items.ItemData;
import net.sf.jasperreports.components.items.fill.FillItem;
import net.sf.jasperreports.engine.component.FillContextProvider;
import net.sf.jasperreports.engine.fill.JRFillObjectFactory;

/**
 * @author sanda zaharia (shertage@users.sourceforge.net)
 */
public class FillPlaceItemData extends FillItemData
{
	/**
	 *
	 */
	public FillPlaceItemData(
		FillContextProvider fillContextProvider,
		ItemData itemData, 
		JRFillObjectFactory factory
		)// throws JRException
	{
		super(fillContextProvider, itemData, factory);
	}
	
	@Override
	public FillItem getFillItem(Item item, JRFillObjectFactory factory){
		return new FillPlaceItem(item, factory);
	}
}