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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RecoverClusterRequest extends RpcAcsRequest<RecoverClusterResponse> {
	
	public RecoverClusterRequest() {
		super("EHPC", "2018-04-12", "RecoverCluster", "ehs");
	}

	private String imageId;

	private String osTag;

	private String accountType;

	private String schedulerType;

	private String clusterId;

	private String imageOwnerAlias;

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getOsTag() {
		return this.osTag;
	}

	public void setOsTag(String osTag) {
		this.osTag = osTag;
		if(osTag != null){
			putQueryParameter("OsTag", osTag);
		}
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
		if(accountType != null){
			putQueryParameter("AccountType", accountType);
		}
	}

	public String getSchedulerType() {
		return this.schedulerType;
	}

	public void setSchedulerType(String schedulerType) {
		this.schedulerType = schedulerType;
		if(schedulerType != null){
			putQueryParameter("SchedulerType", schedulerType);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getImageOwnerAlias() {
		return this.imageOwnerAlias;
	}

	public void setImageOwnerAlias(String imageOwnerAlias) {
		this.imageOwnerAlias = imageOwnerAlias;
		if(imageOwnerAlias != null){
			putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
		}
	}

	@Override
	public Class<RecoverClusterResponse> getResponseClass() {
		return RecoverClusterResponse.class;
	}

}
