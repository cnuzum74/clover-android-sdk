/*
 * Copyright (C) 2013 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v1.tender;

import com.clover.sdk.v1.tender.Tender;
import com.clover.sdk.v1.ResultStatus;

/**
 * An interface for interacting with the Clover tender service. The tender
 * service is a bound AIDL service.
 */

 interface ITenderService {
    List<Tender> getTenders(out ResultStatus resultStatus);
    Tender checkAndCreateTender(String label, String labelKey, boolean enabled, boolean opensCashDrawer, out ResultStatus resultStatus);

    Tender setEnabled(in String tenderId, in boolean enabled, out ResultStatus resultStatus);
}
