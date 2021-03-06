/**Copyright 2012 Research Studios Austria Forschungsgesellschaft mBH
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
package org.easyrec.rest;

import org.easyrec.model.core.web.Item;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class represents an item's profile for marshaling.
 *
 * @author Fabian Salcher
 */
@XmlRootElement(name = "easyrec")
public class ResponseProfile {

    @XmlElement
    private String action;

    @XmlElement
    private String tenantID;

    @XmlElement
    private String itemID;

    @XmlElement
    private String itemType;

    @XmlElement
    private String profile;

    public ResponseProfile() {}

    public ResponseProfile(String action, String tenantID, String itemID,
                           String itemType, String profile) {

        this.action = action;
        this.tenantID = tenantID;
        this.itemID = itemID;
        this.itemType = itemType;
        this.profile = profile;
    }
}
