// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.doris.nereids.jobs;

import org.apache.doris.nereids.PlannerContext;
import org.apache.doris.nereids.properties.PhysicalProperties;

/**
 * Context for one job in Nereids' cascades framework.
 */
public class JobContext {
    private final PlannerContext plannerContext;
    private final PhysicalProperties requiredProperties;
    private final double costUpperBound;

    public JobContext(PlannerContext plannerContext, PhysicalProperties requiredProperties, double costUpperBound) {
        this.plannerContext = plannerContext;
        this.requiredProperties = requiredProperties;
        this.costUpperBound = costUpperBound;
    }

    public PlannerContext getPlannerContext() {
        return plannerContext;
    }

    public PhysicalProperties getRequiredProperties() {
        return requiredProperties;
    }

    public double getCostUpperBound() {
        return costUpperBound;
    }
}
