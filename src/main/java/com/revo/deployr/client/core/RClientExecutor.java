/*
 * RClientExecutor.java
 *
 * Copyright (C) 2010-2016, Microsoft Corporation
 *
 * This program is licensed to you under the terms of Version 2.0 of the
 * Apache License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * Apache License 2.0 (http://www.apache.org/licenses/LICENSE-2.0) for more details.
 *
 */
package com.revo.deployr.client.core;

import com.revo.deployr.client.RClientException;
import com.revo.deployr.client.RGridException;
import com.revo.deployr.client.RSecurityException;
import com.revo.deployr.client.call.RCall;

import org.apache.http.client.utils.URIBuilder;

import java.io.InputStream;

public interface RClientExecutor {

    public RCoreResult processCall(RCall call)
            throws RClientException,
            RSecurityException;

    public RCoreResult processCallOnGrid(RCall call)
            throws RClientException,
            RSecurityException,
            RGridException;

    public InputStream download(URIBuilder builder)
            throws RClientException;

}
