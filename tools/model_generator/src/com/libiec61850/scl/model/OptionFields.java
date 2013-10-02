package com.libiec61850.scl.model;

/*
 *  Copyright 2013 Michael Zillgith
 *
 *	This file is part of libIEC61850.
 *
 *	libIEC61850 is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *
 *	libIEC61850 is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *
 *	You should have received a copy of the GNU General Public License
 *	along with libIEC61850.  If not, see <http://www.gnu.org/licenses/>.
 *
 *	See COPYING file for the complete license text.
 */

import org.w3c.dom.Node;

import com.libiec61850.scl.ParserUtils;
import com.libiec61850.scl.SclParserException;

public class OptionFields {

	private boolean seqNum = false;
	private boolean timeStamp = false;
	private boolean dataSet = false;
	private boolean reasonCode = false;
	private boolean dataRef = false;
	private boolean entryID = false;
	private boolean configRef = false;
	private boolean bufOvfl = true;
	
	public OptionFields(Node optFieldsNode) throws SclParserException {
		Boolean boolVal; 
		
		boolVal = ParserUtils.parseBooleanAttribute(optFieldsNode, "seqNum");
		if (boolVal != null)
			this.seqNum = boolVal;
		
		boolVal = ParserUtils.parseBooleanAttribute(optFieldsNode, "timeStamp");
		if (boolVal != null)
			this.timeStamp = boolVal;
		
		boolVal = ParserUtils.parseBooleanAttribute(optFieldsNode, "dataSet");
		if (boolVal != null)
			this.dataSet = boolVal;
		
		boolVal = ParserUtils.parseBooleanAttribute(optFieldsNode, "reasonCode");
		if (boolVal != null)
			this.reasonCode = boolVal;
		
		boolVal = ParserUtils.parseBooleanAttribute(optFieldsNode, "dataRef");
		if (boolVal != null)
			this.dataRef = boolVal;
		
		boolVal = ParserUtils.parseBooleanAttribute(optFieldsNode, "entryID");
		if (boolVal != null)
			this.entryID = boolVal;
		
		boolVal = ParserUtils.parseBooleanAttribute(optFieldsNode, "bufOvfl");
		if (boolVal != null)
			this.configRef = boolVal;
		
		boolVal = ParserUtils.parseBooleanAttribute(optFieldsNode, "reasonCode");
		if (boolVal != null)
			this.bufOvfl = boolVal;
	}

	public boolean isSeqNum() {
		return seqNum;
	}

	public boolean isTimeStamp() {
		return timeStamp;
	}

	public boolean isDataSet() {
		return dataSet;
	}

	public boolean isReasonCode() {
		return reasonCode;
	}

	public boolean isDataRef() {
		return dataRef;
	}

	public boolean isEntryID() {
		return entryID;
	}

	public boolean isConfigRef() {
		return configRef;
	}

	public boolean isBufOvfl() {
		return bufOvfl;
	}
	
	
}
