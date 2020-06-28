// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.spring.data.gremlin.web.service.repository;

import com.microsoft.azure.spring.data.gremlin.repository.GremlinRepository;
import com.microsoft.azure.spring.data.gremlin.web.service.domain.SpringCloudServiceNetwork;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringCloudServiceNetworkRepository extends GremlinRepository<SpringCloudServiceNetwork, String> {
}
