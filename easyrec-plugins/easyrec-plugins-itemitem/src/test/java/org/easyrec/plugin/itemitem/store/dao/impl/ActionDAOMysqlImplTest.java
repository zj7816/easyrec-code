/*
 * Copyright 2010 Research Studios Austria Forschungsgesellschaft mBH
 *
 * This file is part of easyrec.
 *
 * easyrec is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * easyrec is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with easyrec.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.easyrec.plugin.itemitem.store.dao.impl;

import org.easyrec.plugin.itemitem.store.dao.ActionDAO;
import org.junit.runner.RunWith;
import org.unitils.UnitilsJUnit4TestClassRunner;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBeanByName;

/**
 * Tests for {@link org.easyrec.plugin.itemitem.store.dao.impl.ActionDAOMysqlImpl}.<p><b>Company:&nbsp;</b> SAT, Research
 * Studios Austria</p> <p><b>Copyright:&nbsp;</b> (c) 2007</p> <p><b>last modified:</b><br/> $Author$<br/> $Date$<br/>
 * $Revision$</p>
 *
 * @author Patrick Marschik
 */
@RunWith(UnitilsJUnit4TestClassRunner.class)
@SpringApplicationContext("/spring/plugins/itemitem/ItemItem_AllInOne.xml")
@DataSet("/dbunit/plugins/itemitem/ii_action.xml")
public class ActionDAOMysqlImplTest extends AbstractActionDAOTest {

    @SpringBeanByName
    private ActionDAO itemItemActionDAO;

    @Override
    protected ActionDAO getActionDAO() {
        return itemItemActionDAO;
    }
}
