/*
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
 */

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.TransformClusterMemberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TransformClusterMemberResponseUnmarshaller {

	public static TransformClusterMemberResponse unmarshall(TransformClusterMemberResponse transformClusterMemberResponse, UnmarshallerContext context) {
		
		transformClusterMemberResponse.setRequestId(context.stringValue("TransformClusterMemberResponse.RequestId"));
		transformClusterMemberResponse.setCode(context.integerValue("TransformClusterMemberResponse.Code"));
		transformClusterMemberResponse.setMessage(context.stringValue("TransformClusterMemberResponse.Message"));
		transformClusterMemberResponse.setData(context.stringValue("TransformClusterMemberResponse.Data"));
	 
	 	return transformClusterMemberResponse;
	}
}