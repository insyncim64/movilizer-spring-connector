/*
 * Copyright 2015 Movilizer GmbH
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.movilizer.connectors.spring.testdata.apps;

import com.movilizer.connectors.spring.annotations.MovilizerApp;
import com.movilizer.connectors.spring.annotations.MovilizerComponentScan;
import com.movilizer.connectors.spring.annotations.MovilizerConfig;
import com.movilizer.connectors.spring.testdata.extra.classes.one.AppComponentClassOne;
import com.movilizer.connectors.spring.testdata.extra.classes.two.AppComponentClassTwo;


@MovilizerApp(name = "my-super-app", version = "DEV")
@MovilizerConfig("complete-config-manual.yml")
@MovilizerComponentScan(basePackages = "com.movilizer.connectors.spring.testdata.extra.string",
    basePackageClasses = {AppComponentClassOne.class, AppComponentClassTwo.class})
public class CompleteScanningTestApp {
}