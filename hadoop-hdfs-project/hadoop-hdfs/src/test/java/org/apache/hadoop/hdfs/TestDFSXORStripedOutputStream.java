/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hdfs;

import org.apache.hadoop.hdfs.protocol.ErasureCodingPolicy;
import org.apache.hadoop.hdfs.protocol.HdfsConstants;
import org.apache.hadoop.hdfs.server.namenode.ErasureCodingPolicyManager;

/**
 * This tests write operation of DFS striped file with XOR-2-1-64k erasure code
 * policy.
 */
public class TestDFSXORStripedOutputStream extends TestDFSStripedOutputStream{

  @Override
  public ErasureCodingPolicy getEcPolicy() {
    return ErasureCodingPolicyManager.getPolicyByID(
        HdfsConstants.XOR_2_1_POLICY_ID);
  }
}
