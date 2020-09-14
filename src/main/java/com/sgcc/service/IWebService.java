package com.sgcc.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "IWebService", // 暴露服务名称
targetNamespace = "http://service.sgcc.com"// 命名空间,一般是接口的包名倒序
)
public interface IWebService {
	
	@WebMethod
    public String marketMember(String data);
	
	@WebMethod
	public String plPhysicalGen(String data);
	
	@WebMethod
	public String plSettleUnit(String data);
	
	@WebMethod
	public String plContract(String data);
	
	@WebMethod
	public String monthlyDecompose(String data);
	
	@WebMethod
	public String plGenUnitRelation(String data);
	
	@WebMethod
	public String tLtsSettlementBasic(String data);
	
	@WebMethod
	public String publicCoding(String data);

}
