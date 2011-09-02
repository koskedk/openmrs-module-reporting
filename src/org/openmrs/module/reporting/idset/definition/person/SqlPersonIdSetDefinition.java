/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.reporting.idset.definition.person;

import org.openmrs.module.reporting.common.ObjectUtil;
import org.openmrs.module.reporting.definition.configuration.ConfigurationProperty;
import org.openmrs.module.reporting.idset.definition.BaseIdSetDefinition;

/**
 * SQL-based Person Id Set Definition
 */
public class SqlPersonIdSetDefinition extends BaseIdSetDefinition implements PersonIdSetDefinition {

    public static final long serialVersionUID = 1L;
	
	@ConfigurationProperty(required=true)
	private String query;
	
	//***** CONSTRUCTORS *****

	/**
	 * Default Constructor
	 */
	public SqlPersonIdSetDefinition() {
		super();
	}
	
	/**
	 * 
	 * @param sqlQuery
	 */
	public SqlPersonIdSetDefinition(String query) { 
		this.query = query;
	}

	//***** INSTANCE METHODS *****
	
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "SQL Person Id Set Query: [" + ObjectUtil.nvlStr(query, "") + "]";
	}
	
	//***** PROPERTY ACCESS *****

	/**
	 * @return the query
	 */
	public String getQuery() {
		return query;
	}

	/**
	 * @param query the query to set
	 */
	public void setQuery(String query) {
		this.query = query;
	}
}
