/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ecs.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ServiceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServiceMarshaller {

    private static final MarshallingInfo<String> SERVICEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceArn").build();
    private static final MarshallingInfo<String> SERVICENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceName").build();
    private static final MarshallingInfo<String> CLUSTERARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clusterArn").build();
    private static final MarshallingInfo<List> LOADBALANCERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("loadBalancers").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Integer> DESIREDCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("desiredCount").build();
    private static final MarshallingInfo<Integer> RUNNINGCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runningCount").build();
    private static final MarshallingInfo<Integer> PENDINGCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pendingCount").build();
    private static final MarshallingInfo<String> TASKDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("taskDefinition").build();
    private static final MarshallingInfo<StructuredPojo> DEPLOYMENTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deploymentConfiguration").build();
    private static final MarshallingInfo<List> DEPLOYMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("deployments").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();
    private static final MarshallingInfo<List> EVENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("events").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").build();
    private static final MarshallingInfo<List> PLACEMENTCONSTRAINTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("placementConstraints").build();
    private static final MarshallingInfo<List> PLACEMENTSTRATEGY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("placementStrategy").build();

    private static final ServiceMarshaller instance = new ServiceMarshaller();

    public static ServiceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Service service, ProtocolMarshaller protocolMarshaller) {

        if (service == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(service.getServiceArn(), SERVICEARN_BINDING);
            protocolMarshaller.marshall(service.getServiceName(), SERVICENAME_BINDING);
            protocolMarshaller.marshall(service.getClusterArn(), CLUSTERARN_BINDING);
            protocolMarshaller.marshall(service.getLoadBalancers(), LOADBALANCERS_BINDING);
            protocolMarshaller.marshall(service.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(service.getDesiredCount(), DESIREDCOUNT_BINDING);
            protocolMarshaller.marshall(service.getRunningCount(), RUNNINGCOUNT_BINDING);
            protocolMarshaller.marshall(service.getPendingCount(), PENDINGCOUNT_BINDING);
            protocolMarshaller.marshall(service.getTaskDefinition(), TASKDEFINITION_BINDING);
            protocolMarshaller.marshall(service.getDeploymentConfiguration(), DEPLOYMENTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(service.getDeployments(), DEPLOYMENTS_BINDING);
            protocolMarshaller.marshall(service.getRoleArn(), ROLEARN_BINDING);
            protocolMarshaller.marshall(service.getEvents(), EVENTS_BINDING);
            protocolMarshaller.marshall(service.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(service.getPlacementConstraints(), PLACEMENTCONSTRAINTS_BINDING);
            protocolMarshaller.marshall(service.getPlacementStrategy(), PLACEMENTSTRATEGY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
