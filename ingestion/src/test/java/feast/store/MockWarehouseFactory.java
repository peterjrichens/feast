/*
 * Copyright 2019 The Feast Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package feast.store;

import com.google.auto.service.AutoService;
import feast.store.warehouse.FeatureWarehouseFactory;

@AutoService(FeatureWarehouseFactory.class)
public class MockWarehouseFactory extends MockFeatureStore implements
    FeatureWarehouseFactory {
  public static final String MOCK_WAREHOUSE_STORE_TYPE = "warehouse.mock";

  public MockWarehouseFactory() {
    super(MOCK_WAREHOUSE_STORE_TYPE);
  }
}