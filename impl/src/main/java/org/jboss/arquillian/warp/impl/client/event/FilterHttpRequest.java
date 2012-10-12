/**
 * JBoss, Home of Professional Open Source
 * Copyright 2012, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.arquillian.warp.impl.client.event;

import org.jboss.arquillian.warp.impl.client.enrichment.RequestEnrichmentService;
import org.jboss.netty.handler.codec.http.HttpRequest;

public class FilterHttpRequest implements FilterRequest<HttpRequest> {

    private HttpRequest request;
    private RequestEnrichmentService service;

    public FilterHttpRequest(HttpRequest request, RequestEnrichmentService service) {
        super();
        this.request = request;
        this.service = service;
    }

    @Override
    public HttpRequest getRequest() {
        return request;
    }

    @Override
    public RequestEnrichmentService getService() {
        return service;
    }
}
