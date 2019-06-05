package org.shaalakosh.school.serviceImpl;

import java.util.LinkedHashMap;

import org.shaalakosh.school.constants.StatusMaster;
import org.shaalakosh.school.model.District;
import org.shaalakosh.school.pojo.CustomReponseStatus;
import org.shaalakosh.school.pojo.ServiceResponse;
import org.shaalakosh.school.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;

@Service(value = "masterService")
public class MasterServiceImpl implements MasterService {/*

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private EurekaClient eurekaClient;

	@Value("${master.service.id}")
	private String masterServiceId;

	@Override
	public ServiceResponse getStateById(int stateId) {
		ServiceResponse serviceResponse = new ServiceResponse();
		LinkedHashMap<Object, Object> response = new LinkedHashMap<>();
		CustomReponseStatus responseStatus = null;
		try {
			Application application = eurekaClient.getApplication(masterServiceId);
			InstanceInfo instanceInfo = application.getInstances().get(0);
			String url = "http://" + instanceInfo.getIPAddr() + ":" + instanceInfo.getPort() + "/";
			System.out.println("Master Url: " + url);
			District district = restTemplate.getForObject(url, District.class);

			responseStatus = new CustomReponseStatus(StatusMaster.SUCCESS.getResponseId(),
					StatusMaster.SUCCESS.getResponseCode(), StatusMaster.SUCCESS.getResponseMessage(),
					StatusMaster.SUCCESS.getResponseDescription());
			response.put("customResponse", responseStatus);
			response.put("district", district);
		} catch (Exception e) {
			responseStatus = new CustomReponseStatus(StatusMaster.FAILED.getResponseId(),
					StatusMaster.FAILED.getResponseCode(), StatusMaster.FAILED.getResponseMessage(),
					StatusMaster.FAILED.getResponseDescription());
			response.put("customResponse", responseStatus);
		}
		serviceResponse.setServiceResponse(response);
		return serviceResponse;
	}
*/}
