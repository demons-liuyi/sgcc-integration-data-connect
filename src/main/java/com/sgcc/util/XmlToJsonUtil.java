package com.sgcc.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import com.sgcc.po.MarketMember;
import com.sgcc.po.MonthlyDecompose;
import com.sgcc.po.PlContract;
import com.sgcc.po.PlGenUnitRelation;
import com.sgcc.po.PlPhysicalGen;
import com.sgcc.po.PlSettleUnit;
import com.sgcc.po.PublicCoding;
import com.sgcc.po.TLtsSettlementBasic;

public class XmlToJsonUtil {

	// 解析返回xml，获取指定字段对应的值，再将结果存入MarketMemberList中
	public List<MarketMember> getMarketMemberFromXml(String xml) throws Exception {
		System.out.println("进入getMarketMemberFromXml");
		System.out.println(xml);
		// 创建list对象，用于存放数据
		List<MarketMember> listInfos = new ArrayList<>();
		// 将字符串转成xml对象
		Document document = DocumentHelper.parseText(xml);
		// 获取根节点
		Element root = document.getRootElement();
		// 将根节点里的子节点放入list中
		List<Element> firstelements = root.elements();
		// 遍历根节点中所有子节点
		for (Iterator<Element> it = firstelements.iterator(); it.hasNext();) {
			Element firstelem = it.next();
			// 获取名为result的子节点
			if (firstelem.getName() == "ROW") {
				MarketMember marketMember = new MarketMember();
				List<Element> secondelements = firstelem.elements();
				// 遍历result子节点中的所有节点
				for (Iterator<Element> its = secondelements.iterator(); its.hasNext();) {
					Element element = its.next();
					List<Attribute> attributes = element.attributes();
					for (int i = 0; i < attributes.size(); i++) {
						Attribute attribute = attributes.get(i);
						if ("ID".equals(attribute.getText())) {
							marketMember.setId(element.getData().toString());
						}
						if ("MEMBER_NAME".equals(attribute.getText())) {
							marketMember.setMemberName(element.getData().toString());
						}
						if ("SUPERIOR_UNIT".equals(attribute.getText())) {
							marketMember.setSuperiorUnit(element.getData().toString());
						}
						if ("MEMBER_CODE".equals(attribute.getText())) {
							marketMember.setMemberCode(element.getData().toString());
						}
						if ("SHORT_NAME".equals(attribute.getText())) {
							marketMember.setShortName(element.getData().toString());
						}
						if ("ALIAS".equals(attribute.getText())) {
							marketMember.setAlias(element.getData().toString());
						}
						if ("CLASS_TYPE".equals(attribute.getText())) {
							switch (element.getData().toString()) {
							case "0":
								marketMember.setClassType("ZB_SCCYLX_04");
								break;
							case "1":
								marketMember.setClassType("ZB_SCCYLX_02");
								break;
							case "2":
								marketMember.setClassType("ZB_SCCYLX_0101");
								break;
//							case "3":
//								marketMember.setClassType("ZB_SCCYLX_02");
//								break;
							case "4":
								marketMember.setClassType("ZB_SCCYLX_0102");
								break;
							case "5":
								marketMember.setClassType("ZB_SCCYLX_01");
								break;
							case "6":
								marketMember.setClassType("ZB_SCCYLX_03");
								break;
							default:
								marketMember.setVoltageGrade(element.getData().toString());
								break;
							}

						}
						if ("SOCIAL_CODE".equals(attribute.getText())) {
							marketMember.setSocialCode(element.getData().toString());
						}
						if ("ACCT_BANK_NAME".equals(attribute.getText())) {
							marketMember.setAcctBankName(element.getData().toString());
						}
						if ("ACCT_NAME".equals(attribute.getText())) {
							marketMember.setAcctName(element.getData().toString());
						}
						if ("ACCT_CODE".equals(attribute.getText())) {
							marketMember.setAcctCode(element.getData().toString());
						}
						if ("ACCT_LIAISON".equals(attribute.getText())) {
							marketMember.setAcctLiaison(element.getData().toString());
						}
						if ("COMPANYID".equals(attribute.getText())) {
							marketMember.setCompanyid(element.getData().toString());
						}
						if ("MEMBER_TYPE".equals(attribute.getText())) {
							marketMember.setMemberType(element.getData().toString());
						}
						if ("INSTALL_CAPACITY".equals(attribute.getText())) {
							marketMember.setInstallCapacity(new BigDecimal(element.getData().toString()));
						}
						if ("VOLTAGE_GRADE".equals(attribute.getText())) {
							switch (element.getData().toString()) {
							case "8":
								marketMember.setVoltageGrade("ZB_DYDJ_06");
								break;
							case "7":
								marketMember.setVoltageGrade("ZB_DYDJ_07");
								break;
							case "6":
								marketMember.setVoltageGrade("ZB_DYDJ_08");
								break;
							case "4":
								marketMember.setVoltageGrade("ZB_DYDJ_09");
								break;
							case "10":
								marketMember.setVoltageGrade("ZB_DYDJ_10");
								break;
							case "2":
								marketMember.setVoltageGrade("ZB_DYDJ_11");
								break;
							case "1":
								marketMember.setVoltageGrade("ZB_DYDJ_12");
								break;
							default:
								marketMember.setVoltageGrade(element.getData().toString());
								break;
							}
						}
						if ("POWER_PLANT_TYPE".equals(attribute.getText())) {
							switch (element.getData().toString()) {
							case "1":
								marketMember.setPowerPlantType("ZB_DCXZ_01");
								break;
							case "2":
								marketMember.setPowerPlantType("ZB_DCXZ_02");
								break;
							default:
								marketMember.setPowerPlantType(element.getData().toString());
								break;
							}
						}
						if ("STORAGE_CAPACITY".equals(attribute.getText())) {
							marketMember.setStorageCapacity(new BigDecimal(element.getData().toString()));
						}
						if ("GEOG_REGION".equals(attribute.getText())) {
							marketMember.setGeogRegion(element.getData().toString());
						}
						if ("CONTROL_REGION".equals(attribute.getText())) {
							marketMember.setControlRegion(element.getData().toString());
						}
						if ("ADDRESS".equals(attribute.getText())) {
							marketMember.setAddress(element.getData().toString());
						}
						if ("TAX_RATE".equals(attribute.getText())) {
							marketMember.setTaxRate(element.getData().toString());
						}
						if ("LEGAL_REPRE".equals(attribute.getText())) {
							marketMember.setLegalRepre(element.getData().toString());
						}
						if ("REDIT_MONEY".equals(attribute.getText())) {
							marketMember.setReditMoney(new BigDecimal(element.getData().toString()));
						}
						if ("PROXY_CAPACITY".equals(attribute.getText())) {
							marketMember.setProxyCapacity(new Long(element.getData().toString()));
						}
						if ("BUY_LEVEL".equals(attribute.getText())) {
							switch (element.getData().toString()) {
							case "1":
								marketMember.setBuyLevel("ZB_GSDCJ_01");
								break;
							case "2":
								marketMember.setBuyLevel("ZB_GSDCJ_02");
								break;
							case "3":
								marketMember.setBuyLevel("ZB_GSDCJ_03");
								break;
							case "4":
								marketMember.setBuyLevel("ZB_GSDCJ_04");
								break;
							case "5":
								marketMember.setBuyLevel("ZB_GSDCJ_05");
								break;
							default:
								marketMember.setBuyLevel(element.getData().toString());
								break;
							}
						}
						if ("SETTLE_COMPANY_ID".equals(attribute.getText())) {
							marketMember.setSettleCompanyId(element.getData().toString());
						}
						if ("AGREEMENT_CODE".equals(attribute.getText())) {
							marketMember.setAgreementCode(element.getData().toString());
						}
						if ("NEWSPAPER_CAPACITY".equals(attribute.getText())) {
							marketMember.setNewspaperCapacity(new Long(element.getData().toString()));
						}
						if ("AGREEMENT_STATUS".equals(attribute.getText())) {
							marketMember.setAgreementStatus(element.getData().toString());
						}
						if ("CREATE_USER_ID".equals(attribute.getText())) {
							marketMember.setCreateUserId(element.getData().toString());
						}
						if ("UPDATE_USER_ID".equals(attribute.getText())) {
							marketMember.setUpdateUserId(element.getData().toString());
						}
						if ("DATA_STATUS".equals(attribute.getText())) {
							marketMember.setDataStatus(element.getData().toString());
						}
						if ("CREATE_TIME".equals(attribute.getText())) {
							marketMember.setCreateTime(element.getData().toString());
						}
						if ("UPDATE_TIME".equals(attribute.getText())) {
							marketMember.setUpdateTime(element.getData().toString());
						}
						if ("START_TIME".equals(attribute.getText())) {
							marketMember.setStartTime(element.getData().toString());
						}
						if ("END_TIME".equals(attribute.getText())) {
							marketMember.setEndTime(element.getData().toString());
						}
						if ("SUPPLIER_CODE".equals(attribute.getText())) {
							marketMember.setSupplierCode(element.getData().toString());
						}
						if ("DATA_SOURCE".equals(attribute.getText())) {
							marketMember.setDataSource(element.getData().toString());
						}
						if ("MEMBER_STATUS".equals(attribute.getText())) {
							switch (element.getData().toString()) {
							case "1":
								marketMember.setMemberStatus("ZB_SCCYZT_05");
								break;
							case "3":
								marketMember.setMemberStatus("ZB_SCCYZT_01");
								break;
							case "4":
								marketMember.setMemberStatus("ZB_SCCYZT_03");
								break;
							default:
								marketMember.setMemberStatus(element.getData().toString());
								break;
							}
						}
						if ("RATE".equals(attribute.getText())) {
							marketMember.setRate(element.getData().toString());
						}
						if ("USER_ID".equals(attribute.getText())) {
							marketMember.setUserId(element.getData().toString());
						}
						if ("ELECTRO_TYPE".equals(attribute.getText())) {
							marketMember.setElectroType(element.getData().toString());
						}
						if ("USER_TYPE".equals(attribute.getText())) {
							switch (element.getData().toString()) {
							case "0":
								marketMember.setUserType("ZB_YHLB_10");
								break;
							case "10":
								marketMember.setUserType("ZB_YHLB_01");
								break;
							case "11":
								marketMember.setUserType("ZB_YHLB_0101");
								break;
							case "12":
								marketMember.setUserType("ZB_YHLB_0102");
								break;
							case "20":
								marketMember.setUserType("ZB_YHLB_02");
								break;
							case "21":
								marketMember.setUserType("ZB_YHLB_0201");
								break;
							case "22":
								marketMember.setUserType("ZB_YHLB_0202");
								break;
							case "23":
								marketMember.setUserType("ZB_YHLB_0203");
								break;
							case "30":
								marketMember.setUserType("ZB_YHLB_03");
								break;
							case "31":
								marketMember.setUserType("ZB_YHLB_0301");
								break;
							case "32":
								marketMember.setUserType("ZB_YHLB_0302");
								break;
							case "40":
								marketMember.setUserType("ZB_YHLB_04");
								break;
							case "41":
								marketMember.setUserType("ZB_YHLB_0401");
								break;
							case "42":
								marketMember.setUserType("ZB_YHLB_0402");
								break;
							case "43":
								marketMember.setUserType("ZB_YHLB_0403");
								break;
							case "44":
								marketMember.setUserType("ZB_YHLB_0404");
								break;
							case "45":
								marketMember.setUserType("ZB_YHLB_0405");
								break;
							case "50":
								marketMember.setUserType("ZB_YHLB_05");
								break;
							case "51":
								marketMember.setUserType("ZB_YHLB_0501");
								break;
							case "52":
								marketMember.setUserType("ZB_YHLB_0502");
								break;
							case "53":
								marketMember.setUserType("ZB_YHLB_0504");
								break;
							case "54":
								marketMember.setUserType("ZB_YHLB_0505");
								break;
							case "55":
								marketMember.setUserType("ZB_YHLB_0506");
								break;
							case "56":
								marketMember.setUserType("ZB_YHLB_0507");
								break;
							case "90":
								marketMember.setUserType("ZB_YHLB_07");
								break;
							case "91":
								marketMember.setUserType("ZB_YHLB_09");
								break;
							case "92":
								marketMember.setUserType("ZB_YHLB_06");
								break;
//							case "94":
//								marketMember.setUserType("ZB_YHLB_0801");
//								break;
							default:
								marketMember.setUserType(element.getData().toString());
								break;
							}
						}
						if ("MARKETIZE_STATUS".equals(attribute.getText())) {
							marketMember.setMarketizeStatus(element.getData().toString());
						}
						if ("UNDER_BLOC_NAME".equals(attribute.getText())) {
							switch (element.getData().toString()) {
							case "EGM6AE8BBE9012":
								marketMember.setUserType("ZB_LSJT_01");
								break;
							case "EGM6AE8BBE9005":
								marketMember.setUserType("ZB_LSJT_02");
								break;
							case "EGM6AE8BBE9007":
								marketMember.setUserType("ZB_LSJT_03");
								break;
							case "EGM6AE8BBE9008":
								marketMember.setUserType("ZB_LSJT_04");
								break;
							case "EGM6AE8BBE9009":
								marketMember.setUserType("ZB_LSJT_05");
								break;
							case "EGM6AE8BBE9058":
								marketMember.setUserType("ZB_LSJT_12");
								break;
							default:
								marketMember.setUnderBlocName(element.getData().toString());
								break;
							}
						}
						if ("ELECTRIC_ENERGY_TYPE".equals(attribute.getText())) {
							switch (element.getData().toString()) {
							case "1":
								marketMember.setElectricEnergyType("ZB_DNLX_010101");
								break;
							case "3":
								marketMember.setElectricEnergyType("ZB_DNLX_010102");
								break;
							case "4":
								marketMember.setElectricEnergyType("ZB_DNLX_010104");
								break;
							case "205":
								marketMember.setElectricEnergyType("ZB_DNLX_010105");
								break;
							case "206":
								marketMember.setElectricEnergyType("ZB_DNLX_010106");
								break;
							case "2":
								marketMember.setElectricEnergyType("ZB_DNLX_0102");
								break;
							case "0":
								marketMember.setElectricEnergyType("ZB_DNLX_010201");
								break;
							default:
								marketMember.setElectricEnergyType(element.getData().toString());
								break;
							}
						}
						if ("STATE_GRID_TYPE".equals(attribute.getText())) {
							marketMember.setStateGridType(element.getData().toString());
						}
						if ("MARKETING_USER_NO".equals(attribute.getText())) {
							marketMember.setMarketingUserNo(element.getData().toString());
						}
						if ("SALE_MEMBER_TYPE".equals(attribute.getText())) {
							switch (element.getData().toString()) {
							case "01":
								marketMember.setSaleMemberType("ZB_SDGSLX_01");
								break;
							case "02":
								marketMember.setSaleMemberType("ZB_SDGSLX_02");
								break;
							default:
								marketMember.setSaleMemberType(element.getData().toString());
								break;
							}
						}
						if ("ORGANIZATION_ID".equals(attribute.getText())) {
							marketMember.setOrganizationId(element.getData().toString());
						}
					}
				}
				listInfos.add(marketMember);
			}
		}
		return listInfos;
	}

	// 解析返回xml，获取指定字段对应的值，再将结果存入PlPhysicalGenList中
	public List<PlPhysicalGen> getPlPhysicalGenFromXml(String xml) throws Exception {
		System.out.println("进入getPlPhysicalGenFromXml");
		System.out.println(xml);
		List<PlPhysicalGen> listInfos = new ArrayList<>();
		Document document = DocumentHelper.parseText(xml);
		Element root = document.getRootElement();
		List<Element> firstelements = root.elements();
		for (Iterator<Element> it = firstelements.iterator(); it.hasNext();) {
			Element firstelem = it.next();
			if (firstelem.getName() == "ROW") {
				PlPhysicalGen plPhysicalGen = new PlPhysicalGen();
				List<Element> secondelements = firstelem.elements();
				for (Iterator<Element> its = secondelements.iterator(); its.hasNext();) {
					Element element = its.next();
					List<Attribute> attributes = element.attributes();
					for (int i = 0; i < attributes.size(); i++) {
						Attribute attribute = attributes.get(i);
						if ("GEN_ID".equals(attribute.getText())) {
							plPhysicalGen.setGenId(element.getData().toString());
						}
						if ("GEN_NAME".equals(attribute.getText())) {
							plPhysicalGen.setGenName(element.getData().toString());
						}
						if ("GEN_CODE".equals(attribute.getText())) {
							plPhysicalGen.setGenCode(element.getData().toString());
						}
						if ("DISPATCH_GEN_CODE".equals(attribute.getText())) {
							plPhysicalGen.setDispatchGenCode(element.getData().toString());
						}
						if ("MEMBER_ID".equals(attribute.getText())) {
							plPhysicalGen.setMemberId(element.getData().toString());
						}
						if ("NODE_ID".equals(attribute.getText())) {
							plPhysicalGen.setNodeId(element.getData().toString());
						}
						if ("AREA_ID".equals(attribute.getText())) {
							plPhysicalGen.setAreaId(element.getData().toString());
						}
						if ("CAPACITY".equals(attribute.getText())) {
							plPhysicalGen.setCapacity(new BigDecimal(element.getData().toString()));
						}
						if ("PRODUCT_TIME".equals(attribute.getText())) {
							plPhysicalGen.setProductTime(element.getData().toString());
						}
						if ("MERCH_TIME".equals(attribute.getText())) {
							plPhysicalGen.setMerchTime(element.getData().toString());
						}
						if ("FUEL_TYPE".equals(attribute.getText())) {
							plPhysicalGen.setFuelType(element.getData().toString());
						}
						if ("PEAK_ABILITY".equals(attribute.getText())) {
							plPhysicalGen.setPeakAbility(element.getData().toString());
						}
						if ("AGC_ABILITY".equals(attribute.getText())) {
							plPhysicalGen.setAgcAbility(element.getData().toString());
						}
						if ("HAS_HEAT_SUPPLY".equals(attribute.getText())) {
							plPhysicalGen.setHasHeatSupply(element.getData().toString());
						}
						if ("POWER_GENERATION".equals(attribute.getText())) {
							plPhysicalGen.setPowerGeneration(element.getData().toString());
						}
						if ("TAX_RATE".equals(attribute.getText())) {
							plPhysicalGen.setTaxRate(element.getData().toString());
						}
						if ("SCHEDUE_TYPE".equals(attribute.getText())) {
							switch (element.getData().toString()) {
							case "1":
								plPhysicalGen.setSchedueType("ZB_DDFS_0101");
								break;
							case "2":
								plPhysicalGen.setSchedueType("ZB_DDFS_0102");
								break;
							case "3":
								plPhysicalGen.setSchedueType("ZB_DDFS_0103");
								break;
							case "4":
								plPhysicalGen.setSchedueType("ZB_DDFS_0201");
								break;
							case "5":
								plPhysicalGen.setSchedueType("ZB_DDFS_0202");
								break;
							default:
								break;
							}
							plPhysicalGen.setSchedueType(element.getData().toString());
						}
						if ("POWER_GENE_TYPE".equals(attribute.getText())) {
							switch (element.getData().toString()) {
							case "1":
								plPhysicalGen.setPowerGeneType("ZB_DDFS_0101");
								break;
							case "2":
								plPhysicalGen.setPowerGeneType("ZB_DDFS_0102");
								break;
							case "3":
								plPhysicalGen.setPowerGeneType("ZB_DDFS_0103");
								break;
							case "4":
								plPhysicalGen.setPowerGeneType("ZB_DDFS_0201");
								break;
							case "5":
								plPhysicalGen.setPowerGeneType("ZB_DDFS_0202");
								break;
							default:
								break;
							}
							plPhysicalGen.setPowerGeneType(element.getData().toString());
						}
						if ("HAS_DESUFL".equals(attribute.getText())) {
							plPhysicalGen.setHasDesufl(element.getData().toString());
						}
						if ("HAS_DUST_REMOVAL".equals(attribute.getText())) {
							plPhysicalGen.setHasDustRemoval(element.getData().toString());
						}
						if ("HAS_SUPER_CLEAN".equals(attribute.getText())) {
							plPhysicalGen.setHasSuperClean(element.getData().toString());
						}
						if ("HAS_DESUFL_FACILITIES".equals(attribute.getText())) {
							plPhysicalGen.setHasDesuflFacilities(element.getData().toString());
						}
						if ("HAS_COMBINED_CYCLE".equals(attribute.getText())) {
							plPhysicalGen.setHasCombinedCycle(element.getData().toString());
						}
						if ("HAS_DENITRATION".equals(attribute.getText())) {
							plPhysicalGen.setHasDenitration(element.getData().toString());
						}
						if ("MIN_ECON_ABLITY".equals(attribute.getText())) {
							plPhysicalGen.setMinEconAblity(new BigDecimal(element.getData().toString()));
						}
						if ("MAX_ECON_ABLITY".equals(attribute.getText())) {
							plPhysicalGen.setMaxEconAblity(new BigDecimal(element.getData().toString()));
						}
						if ("MAX_ROTA_STANDBY".equals(attribute.getText())) {
							plPhysicalGen.setMaxRotaStandby(new BigDecimal(element.getData().toString()));
						}
						if ("MAX_RUN_ABLITY".equals(attribute.getText())) {
							plPhysicalGen.setMaxRunAblity(new BigDecimal(element.getData().toString()));
						}
						if ("MIN_STOP_CYCLE".equals(attribute.getText())) {
							plPhysicalGen.setMinStopCycle(new BigDecimal(element.getData().toString()));
						}
						if ("MIN_RUN_ABLITY".equals(attribute.getText())) {
							plPhysicalGen.setMinRunAblity(new BigDecimal(element.getData().toString()));
						}
						if ("ROTA_STANDBY_RATE".equals(attribute.getText())) {
							plPhysicalGen.setRotaStandbyRate(new BigDecimal(element.getData().toString()));
						}
						if ("START_COST".equals(attribute.getText())) {
							plPhysicalGen.setStartCost(new BigDecimal(element.getData().toString()));
						}
						if ("VOLTAGE_CLASS".equals(attribute.getText())) {
							plPhysicalGen.setVoltageClass(element.getData().toString());
						}
						if ("VOLTAGE_GRADE".equals(attribute.getText())) {
							switch (element.getData().toString()) {
							case "8":
								plPhysicalGen.setVoltageClass("ZB_DYDJ_06");
								break;
							case "7":
								plPhysicalGen.setVoltageClass("ZB_DYDJ_07");
								break;
							case "6":
								plPhysicalGen.setVoltageClass("ZB_DYDJ_08");
								break;
							case "4":
								plPhysicalGen.setVoltageClass("ZB_DYDJ_09");
								break;
							case "10":
								plPhysicalGen.setVoltageClass("ZB_DYDJ_10");
								break;
							case "2":
								plPhysicalGen.setVoltageClass("ZB_DYDJ_11");
								break;
							case "1":
								plPhysicalGen.setVoltageClass("ZB_DYDJ_12");
								break;
							default:
								plPhysicalGen.setVoltageClass(element.getData().toString());
								break;
							}

						}
						if ("GEN_STATUS".equals(attribute.getText())) {
							switch (element.getData().toString()) {
							case "2":
								plPhysicalGen.setGenStatus("ZB_JZZT_03");
								break;
							case "3":
								plPhysicalGen.setGenStatus("ZB_JZZT_04");
								break;
							case "4":
								plPhysicalGen.setGenStatus("ZB_JZZT_05");
								break;
							case "5":
								plPhysicalGen.setGenStatus("ZB_JZZT_06");
								break;
							case "1":
								plPhysicalGen.setGenStatus("ZB_JZZT_07");
								break;
							default:
								plPhysicalGen.setGenStatus(element.getData().toString());
								break;
							}
						}
						if ("START_TIME".equals(attribute.getText())) {
							plPhysicalGen.setStartTime(element.getData().toString());
						}
						if ("START_TIME".equals(attribute.getText())) {
							plPhysicalGen.setStartTime(element.getData().toString());
						}
						if ("END_TIME".equals(attribute.getText())) {
							plPhysicalGen.setEndTime(element.getData().toString());
						}
						if ("CREATE_USER_ID".equals(attribute.getText())) {
							plPhysicalGen.setCreateUserId(element.getData().toString());
						}
						if ("CREATE_TIME".equals(attribute.getText())) {
							plPhysicalGen.setCreateTime(element.getData().toString());
						}
						if ("UPDATE_USER_ID".equals(attribute.getText())) {
							plPhysicalGen.setUpdateUserId(element.getData().toString());
						}
						if ("UPDATE_TIME".equals(attribute.getText())) {
							plPhysicalGen.setUpdateTime(element.getData().toString());
						}
						if ("DATA_STATUS".equals(attribute.getText())) {
							plPhysicalGen.setDataStatus(element.getData().toString());
						}
						if ("VERSION".equals(attribute.getText())) {
							plPhysicalGen.setVersion(new Long(element.getData().toString()));
						}
						if ("DATA_SOURCE".equals(attribute.getText())) {
							plPhysicalGen.setDataSource(element.getData().toString());
						}
						if ("MARKETIZE_STATUS".equals(attribute.getText())) {
							plPhysicalGen.setMarketizeStatus(element.getData().toString());
						}
						if ("HAS_SPOT_MARKET".equals(attribute.getText())) {
							plPhysicalGen.setHasSpotMarket(element.getData().toString());
						}
						if ("OK_ABUD_DRY".equals(attribute.getText())) {
							plPhysicalGen.setOkAbudDry(element.getData().toString());
						}
						if ("OK_TIME_SHARING".equals(attribute.getText())) {
							plPhysicalGen.setOkTimeSharing(element.getData().toString());
						}
						if ("ORGANIZATION_ID".equals(attribute.getText())) {
							plPhysicalGen.setOrganizationId(element.getData().toString());
						}
					}
				}
				listInfos.add(plPhysicalGen);
			}
		}
		return listInfos;
	}

	// 解析返回xml，获取指定字段对应的值，再将结果存入PlSettleUnitList中
	public List<PlSettleUnit> getPlSettleUnitFromXml(String xml) throws Exception {
		System.out.println("进入getPlSettleUnitFromXml");
		System.out.println(xml);
		List<PlSettleUnit> listInfos = new ArrayList<>();
		Document document = DocumentHelper.parseText(xml);
		Element root = document.getRootElement();
		List<Element> firstelements = root.elements();
		for (Iterator<Element> it = firstelements.iterator(); it.hasNext();) {
			Element firstelem = it.next();
			if (firstelem.getName() == "ROW") {
				PlSettleUnit plSettleUnit = new PlSettleUnit();
				List<Element> secondelements = firstelem.elements();
				for (Iterator<Element> its = secondelements.iterator(); its.hasNext();) {
					Element element = its.next();
					List<Attribute> attributes = element.attributes();
					for (int i = 0; i < attributes.size(); i++) {
						Attribute attribute = attributes.get(i);
						if ("SETTLE_ID".equals(attribute.getText())) {
							plSettleUnit.setSettleId(element.getData().toString());
						}
						if ("SETTLE_CODE".equals(attribute.getText())) {
							plSettleUnit.setSettleCode(element.getData().toString());
						}
						if ("SETTLE_NAME".equals(attribute.getText())) {
							plSettleUnit.setSettleName(element.getData().toString());
						}
						if ("SETTLE_ALIAS_NAME".equals(attribute.getText())) {
							plSettleUnit.setSettleAliasName(element.getData().toString());
						}
						if ("MARKET_MEMBER_ID".equals(attribute.getText())) {
							plSettleUnit.setMarketMemberId(element.getData().toString());
						}
						if ("SETTLE_STATUS".equals(attribute.getText())) {
							plSettleUnit.setSettleStatus(element.getData().toString());
						}
						if ("SETTLE_TYPE".equals(attribute.getText())) {
							switch (element.getData().toString()) {
							case "2":
								plSettleUnit.setSettleType("ZB_JSDYLX_01");
								break;
							case "3":
								plSettleUnit.setSettleType("ZB_JSDYLX_02");
								break;
							case "4":
								plSettleUnit.setSettleType("ZB_JSDYLX_03");
								break;
							case "5":
								plSettleUnit.setSettleType("ZB_JSDYLX_04");
								break;
							default:
								plSettleUnit.setSettleType(element.getData().toString());
								break;
							}
						}

						if ("AUTHORIZED_TARIFF".equals(attribute.getText())) {
							plSettleUnit.setAuthorizedTariff(new BigDecimal(element.getData().toString()));
						}
						if ("START_TIME".equals(attribute.getText())) {
							plSettleUnit.setStartTime(element.getData().toString());
						}
						if ("END_TIME".equals(attribute.getText())) {
							plSettleUnit.setEndTime(element.getData().toString());
						}
						if ("DATA_STATUS".equals(attribute.getText())) {
							plSettleUnit.setDataStatus(element.getData().toString());
						}
						if ("CREATE_USER_ID".equals(attribute.getText())) {
							plSettleUnit.setCreateUserId(element.getData().toString());
						}
						if ("CREATE_TIME".equals(attribute.getText())) {
							plSettleUnit.setCreateTime(element.getData().toString());
						}
						if ("UPDATE_USER_ID".equals(attribute.getText())) {
							plSettleUnit.setUpdateUserId(element.getData().toString());
						}
						if ("UPDATE_TIME".equals(attribute.getText())) {
							plSettleUnit.setUpdateTime(element.getData().toString());
						}
						if ("VERSION".equals(attribute.getText())) {
							plSettleUnit.setVersion(new Long(element.getData().toString()));
						}
						if ("TAX_RATE".equals(attribute.getText())) {
							plSettleUnit.setTaxRate(element.getData().toString());
						}
						if ("DATA_SOURCE".equals(attribute.getText())) {
							plSettleUnit.setDataSource(element.getData().toString());
						}
						if ("ORGANIZATION_ID".equals(attribute.getText())) {
							plSettleUnit.setOrganizationId(element.getData().toString());
						}
					}
				}
				listInfos.add(plSettleUnit);
			}
		}
		return listInfos;
	}

	// 解析返回xml，获取指定字段对应的值，再将结果存入PlContractList中
	public List<PlContract> getPlContractFromXml(String xml) throws Exception {
		System.out.println("进入getPlContractFromXml!");
		System.out.println(xml);
		List<PlContract> listInfos = new ArrayList<>();
		Document document = DocumentHelper.parseText(xml);
		Element root = document.getRootElement();
		List<Element> firstelements = root.elements();
		for (Iterator<Element> it = firstelements.iterator(); it.hasNext();) {
			Element firstelem = it.next();
			if (firstelem.getName() == "ROW") {
				PlContract plContract = new PlContract();
				List<Element> secondelements = firstelem.elements();
				for (Iterator<Element> its = secondelements.iterator(); its.hasNext();) {
					Element element = its.next();
					List<Attribute> attributes = element.attributes();
					for (int i = 0; i < attributes.size(); i++) {
						Attribute attribute = attributes.get(i);
						if ("CONTRACT_ID".equals(attribute.getText())) {
							plContract.setContractId(element.getData().toString());
						}
						if ("CONTRACT_CODE".equals(attribute.getText())) {
							plContract.setContractCode(element.getData().toString());
						}
						if ("CONTRACT_NAME".equals(attribute.getText())) {
							plContract.setContractName(element.getData().toString());
						}
						if ("CONTRACT_TYPE".equals(attribute.getText())) {
							switch (element.getData().toString()) {
							case "GS101000":
								plContract.setContractType("ZB_HTLX_02");
								break;
							case "50":
								plContract.setContractType("ZB_HTLX_03");
								break;
							case "GZ501000":
								plContract.setContractType("ZB_HTLX_0301");
								break;
							case "NZ503000":
								plContract.setContractType("ZB_HTLX_0302");
								break;
							case "DYHNDGP":
								plContract.setContractType("ZB_HTLX_0303");
								break;
							case "dyhndsb":
								plContract.setContractType("ZB_HTLX_0304");
								break;
							case "dyhndjz":
								plContract.setContractType("ZB_HTLX_0305");
								break;
							case "ZB60":
								plContract.setContractType("ZB_HTLX_05");
								break;
							default:
								plContract.setContractType(element.getData().toString());
								break;
							}
						}
						if ("COMPANY_ID".equals(attribute.getText())) {
							plContract.setCompanyId(element.getData().toString());
						}
						if ("PURCHASER_ID".equals(attribute.getText())) {
							plContract.setPurchaserId(element.getData().toString());
						}
						if ("SALER_ID".equals(attribute.getText())) {
							plContract.setSalerId(element.getData().toString());
						}
						if ("TRANSFER_ID".equals(attribute.getText())) {
							plContract.setTransferId(element.getData().toString());
						}
						if ("VERSION".equals(attribute.getText())) {
							plContract.setVersion(Integer.valueOf(element.getData().toString()));
						}
						if ("CONTRACT_ENERGY".equals(attribute.getText())) {
							plContract.setContractEnergy(new BigDecimal(element.getData().toString()));
						}
						if ("POWER_TYPE".equals(attribute.getText())) {
							switch (element.getData().toString()) {
							case "1":
								plContract.setPowerType("ZB_DLKJ_03");
								break;
							case "2":
								plContract.setPowerType("ZB_DLKJ_04");
								break;
							default:
								plContract.setPowerType(element.getData().toString());
								break;
							}
						}
						if ("CONTRACT_PRICE".equals(attribute.getText())) {
							plContract.setContractPrice(new BigDecimal(element.getData().toString()));
						}
						if ("START_DATE".equals(attribute.getText())) {
							plContract.setStartDate(element.getData().toString());
						}
						if ("END_DATE".equals(attribute.getText())) {
							plContract.setEndDate(element.getData().toString());
						}
						if ("TRANSACTION_CYCLE".equals(attribute.getText())) {
							switch (element.getData().toString()) {
							case "1":
								plContract.setTransactionCycle("1");
								break;
							case "3":
								plContract.setTransactionCycle("2");
								break;
							case "2":
								plContract.setTransactionCycle("3");
								break;
							case "4":
								plContract.setTransactionCycle("4");
								break;
							case "5":
								plContract.setTransactionCycle("5");
								break;
							case "6":
								plContract.setTransactionCycle("6");
								break;
							default:
								plContract.setTransactionCycle(element.getData().toString());
								break;
							}
						}
						if ("SIGNING_TIME".equals(attribute.getText())) {
							plContract.setSigningTime(element.getData().toString());
						}
						if ("GENERATION_RIGHTS_NAME".equals(attribute.getText())) {
							plContract.setGenerationRightsName(element.getData().toString());
						}
						if ("REPLACE_TYPE".equals(attribute.getText())) {
							plContract.setReplaceType(element.getData().toString());
						}
						if ("REPLACE_CONTRACT_ID".equals(attribute.getText())) {
							plContract.setReplaceContractId(element.getData().toString());
						}
						if ("DATA_STATUS".equals(attribute.getText())) {
							plContract.setDataStatus(element.getData().toString());
						}
						if ("CREATE_TIME".equals(attribute.getText())) {
							plContract.setCreateTime(element.getData().toString());
						}
						if ("UPDATE_TIME".equals(attribute.getText())) {
							plContract.setUpdateTime(element.getData().toString());
						}
						if ("CREATE_USER_ID".equals(attribute.getText())) {
							plContract.setCreateUserId(element.getData().toString());
						}
						if ("UPDATE_USER_ID".equals(attribute.getText())) {
							plContract.setUpdateUserId(element.getData().toString());
						}
						if ("CONTRACT_STATUS".equals(attribute.getText())) {
							plContract.setContractStatus(element.getData().toString());
						}
						if ("DATA_SOURCE".equals(attribute.getText())) {
							plContract.setDataSource(element.getData().toString());
						}
						if ("ORGANIZATION_ID".equals(attribute.getText())) {
							plContract.setOrganizationId(element.getData().toString());
						}
					}
				}
				listInfos.add(plContract);
			}
		}
		return listInfos;
	}

	// 解析返回xml，获取指定字段对应的值，再将结果存入MonthlyDecomposeList中
	public List<MonthlyDecompose> getMonthlyDecomposeFromXml(String xml) throws Exception {
		System.out.println("进入getMonthlyDecomposeFromXml!");
		System.out.println(xml);
		List<MonthlyDecompose> listInfos = new ArrayList<>();
		Document document = DocumentHelper.parseText(xml);
		Element root = document.getRootElement();
		List<Element> firstelements = root.elements();
		for (Iterator<Element> it = firstelements.iterator(); it.hasNext();) {
			Element firstelem = it.next();
			if (firstelem.getName() == "ROW") {
				MonthlyDecompose monthlyDecompose = new MonthlyDecompose();
				List<Element> secondelements = firstelem.elements();
				for (Iterator<Element> its = secondelements.iterator(); its.hasNext();) {
					Element element = its.next();
					List<Attribute> attributes = element.attributes();
					for (int i = 0; i < attributes.size(); i++) {
						Attribute attribute = attributes.get(i);
						if ("DECOMPOSE_ID".equals(attribute.getText())) {
							monthlyDecompose.setDecomposeId(element.getData().toString());
						}
						if ("CONTRACT_ID".equals(attribute.getText())) {
							monthlyDecompose.setContractId(element.getData().toString());
						}
						if ("PARTICULAR_YEAR".equals(attribute.getText())) {
							monthlyDecompose.setParticularYear(Integer.valueOf(element.getData().toString()));
						}
						if ("MONTH".equals(attribute.getText())) {
							monthlyDecompose.setMonth(Integer.valueOf(element.getData().toString()));
						}
						if ("DECOMPOSE_ELECTRICITY".equals(attribute.getText())) {
							monthlyDecompose.setDecomposeElectricity(new BigDecimal(element.getData().toString()));
						}
						if ("CREATE_USER_ID".equals(attribute.getText())) {
							monthlyDecompose.setCreateUserId(element.getData().toString());
						}
						if ("CREATE_TIME".equals(attribute.getText())) {
							monthlyDecompose.setCreateTime(element.getData().toString());
						}
						if ("UPDATE_USER_ID".equals(attribute.getText())) {
							monthlyDecompose.setUpdateUserId(element.getData().toString());
						}
						if ("UPDATE_TIME".equals(attribute.getText())) {
							monthlyDecompose.setUpdateTime(element.getData().toString());
						}
						if ("VERSION".equals(attribute.getText())) {
							monthlyDecompose.setVersion(new Long(element.getData().toString()));
						}
						if ("DATA_STATUS".equals(attribute.getText())) {
							monthlyDecompose.setDataStatus(element.getData().toString());
						}
					}
				}
				listInfos.add(monthlyDecompose);
			}
		}
		return listInfos;
	}

	// 解析返回xml，获取指定字段对应的值，再将结果存入PlGenUnitRelationList中
	public List<PlGenUnitRelation> getPlGenUnitRelationFromXml(String xml) throws Exception {
		System.out.println("进入getPlGenUnitRelationFromXml!");
		System.out.println(xml);
		List<PlGenUnitRelation> listInfos = new ArrayList<>();
		Document document = DocumentHelper.parseText(xml);
		Element root = document.getRootElement();
		List<Element> firstelements = root.elements();
		for (Iterator<Element> it = firstelements.iterator(); it.hasNext();) {
			Element firstelem = it.next();
			if (firstelem.getName() == "ROW") {
				PlGenUnitRelation plGenUnitRelation = new PlGenUnitRelation();
				List<Element> secondelements = firstelem.elements();
				for (Iterator<Element> its = secondelements.iterator(); its.hasNext();) {
					Element element = its.next();
					List<Attribute> attributes = element.attributes();
					for (int i = 0; i < attributes.size(); i++) {
						Attribute attribute = attributes.get(i);
						if ("RELATION_ID".equals(attribute.getText())) {
							plGenUnitRelation.setRelationId(element.getData().toString());
						}
						if ("ECO_UNIT_ID".equals(attribute.getText())) {
							plGenUnitRelation.setEcoUnitId(element.getData().toString());
						}
						if ("UNIT_ID".equals(attribute.getText())) {
							plGenUnitRelation.setUnitId(element.getData().toString());
						}
						if ("START_TIME".equals(attribute.getText())) {
							plGenUnitRelation.setStartTime(element.getData().toString());
						}
						if ("END_TIME".equals(attribute.getText())) {
							plGenUnitRelation.setEndTime(element.getData().toString());
						}
						if ("UPDATE_TIME".equals(attribute.getText())) {
							plGenUnitRelation.setUpdateTime(element.getData().toString());
						}
						if ("UPDATE_USER_ID".equals(attribute.getText())) {
							plGenUnitRelation.setUpdateUserId(element.getData().toString());
						}
						if ("DATA_STATUS".equals(attribute.getText())) {
							plGenUnitRelation.setDataStatus(element.getData().toString());
						}
					}
				}
				listInfos.add(plGenUnitRelation);
			}
		}
		return listInfos;
	}

	// 解析返回xml，获取指定字段对应的值，再将结果存入TLtsSettlementBasicList中
	public List<TLtsSettlementBasic> getTLtsSettlementBasicFromXml(String xml) throws Exception {
		System.out.println("进入getTLtsSettlementBasicFromXml!");
		System.out.println(xml);
		List<TLtsSettlementBasic> listInfos = new ArrayList<>();
		Document document = DocumentHelper.parseText(xml);
		Element root = document.getRootElement();
		List<Element> firstelements = root.elements();
		for (Iterator<Element> it = firstelements.iterator(); it.hasNext();) {
			Element firstelem = it.next();
			if (firstelem.getName() == "ROW") {
				TLtsSettlementBasic tLtsSettlementBasic = new TLtsSettlementBasic();
				List<Element> secondelements = firstelem.elements();
				for (Iterator<Element> its = secondelements.iterator(); its.hasNext();) {
					Element element = its.next();
					List<Attribute> attributes = element.attributes();
					for (int i = 0; i < attributes.size(); i++) {
						Attribute attribute = attributes.get(i);
						if ("SETTLE_ID".equals(attribute.getText())) {
							tLtsSettlementBasic.setSettleId(element.getData().toString());
						}
						if ("DATA_STATE".equals(attribute.getText())) {
							tLtsSettlementBasic.setDataState(element.getData().toString());
						}
						if ("SETTLE_MONTH".equals(attribute.getText())) {
							tLtsSettlementBasic.setSettleMonth(element.getData().toString());
						}
						if ("GEN_ID".equals(attribute.getText())) {
							tLtsSettlementBasic.setGenId(element.getData().toString());
						}
						if ("MEMBER_ID".equals(attribute.getText())) {
							tLtsSettlementBasic.setMemberId(element.getData().toString());
						}
						if ("CONTRACT_ID".equals(attribute.getText())) {
							tLtsSettlementBasic.setContractId(element.getData().toString());
						}
						if ("PURCHASER_ID".equals(attribute.getText())) {
							tLtsSettlementBasic.setPurchaserId(element.getData().toString());
						}
						if ("COMPONENT_ID".equals(attribute.getText())) {
							tLtsSettlementBasic.setComponentId(element.getData().toString());
						}
						if ("MANAGE_MODE".equals(attribute.getText())) {
							tLtsSettlementBasic.setManageMode(element.getData().toString());
						}
						if ("DATA_SOURCE".equals(attribute.getText())) {
							tLtsSettlementBasic.setDataSource(element.getData().toString());
						}
						if ("GENERATE_DATE".equals(attribute.getText())) {
							tLtsSettlementBasic.setGenerateDate(element.getData().toString());
						}
						if ("BELONG_UNIT".equals(attribute.getText())) {
							tLtsSettlementBasic.setBelongUnit(element.getData().toString());
						}
						if ("IS_USE".equals(attribute.getText())) {
							tLtsSettlementBasic.setIsUse(element.getData().toString());
						}
						if ("REVIEW_STATUS".equals(attribute.getText())) {
							tLtsSettlementBasic.setReviewStatus(element.getData().toString());
						}
						if ("TOTAL_ELECTRIC_CHARGE".equals(attribute.getText())) {
							tLtsSettlementBasic.setTotalElectricCharge(new BigDecimal(element.getData().toString()));
						}
						if ("TOTAL_ELECTRIC_PRICE".equals(attribute.getText())) {
							tLtsSettlementBasic.setTotalElectricPrice(new BigDecimal(element.getData().toString()));
						}
						if ("TOTAL_ELECTRIC_COST".equals(attribute.getText())) {
							tLtsSettlementBasic.setTotalElectricCost(new BigDecimal(element.getData().toString()));
						}
						if ("NOT_PERFORM_PEAK_VALLEY_CHARGE".equals(attribute.getText())) {
							tLtsSettlementBasic
									.setNotPerformPeakValleyCharge(new BigDecimal(element.getData().toString()));
						}
						if ("NOT_PERFORM_PEAK_VALLEY_PRICE".equals(attribute.getText())) {
							tLtsSettlementBasic
									.setNotPerformPeakValleyPrice(new BigDecimal(element.getData().toString()));
						}
						if ("NOT_PERFORM_PEAK_VALLEY_COST".equals(attribute.getText())) {
							tLtsSettlementBasic
									.setNotPerformPeakValleyCost(new BigDecimal(element.getData().toString()));
						}
						if ("TIP_ELECTRIC_CHARGE".equals(attribute.getText())) {
							tLtsSettlementBasic.setTipElectricCharge(new BigDecimal(element.getData().toString()));
						}
						if ("TIP_ELECTRIC_PRICE".equals(attribute.getText())) {
							tLtsSettlementBasic.setTipElectricPrice(new BigDecimal(element.getData().toString()));
						}
						if ("TIP_ELECTRIC_COST".equals(attribute.getText())) {
							tLtsSettlementBasic.setTipElectricCost(new BigDecimal(element.getData().toString()));
						}
						if ("PEAK_ELECTRIC_CHARGE".equals(attribute.getText())) {
							tLtsSettlementBasic.setPeakElectricCharge(new BigDecimal(element.getData().toString()));
						}
						if ("PEAK_ELECTRIC_PRICE".equals(attribute.getText())) {
							tLtsSettlementBasic.setPeakElectricPrice(new BigDecimal(element.getData().toString()));
						}
						if ("PEAK_ELECTRIC_COST".equals(attribute.getText())) {
							tLtsSettlementBasic.setPeakElectricCost(new BigDecimal(element.getData().toString()));
						}
						if ("LEVEL_ELECTRIC_CHARGE".equals(attribute.getText())) {
							tLtsSettlementBasic.setLevelElectricCharge(new BigDecimal(element.getData().toString()));
						}
						if ("LEVEL_ELECTRIC_PRICE".equals(attribute.getText())) {
							tLtsSettlementBasic.setLevelElectricPrice(new BigDecimal(element.getData().toString()));
						}
						if ("LEVEL_ELECTRIC_COST".equals(attribute.getText())) {
							tLtsSettlementBasic.setLevelElectricCost(new BigDecimal(element.getData().toString()));
						}
						if ("VALLEY_ELECTRIC_CHARGE".equals(attribute.getText())) {
							tLtsSettlementBasic.setValleyElectricCharge(new BigDecimal(element.getData().toString()));
						}
						if ("VALLEY_ELECTRIC_PRICE".equals(attribute.getText())) {
							tLtsSettlementBasic.setValleyElectricPrice(new BigDecimal(element.getData().toString()));
						}
						if ("VALLEY_ELECTRIC_COST".equals(attribute.getText())) {
							tLtsSettlementBasic.setValleyElectricCost(new BigDecimal(element.getData().toString()));
						}
						if ("IS_CONFIRM".equals(attribute.getText())) {
							tLtsSettlementBasic.setIsConfirm(element.getData().toString());
						}
						if ("POWER_TYPE".equals(attribute.getText())) {
							tLtsSettlementBasic.setPowerType(element.getData().toString());
						}
					}
				}
				listInfos.add(tLtsSettlementBasic);
			}
		}
		return listInfos;
	}

	// 解析返回xml，获取指定字段对应的值，再将结果存入PublicCodingList中
	public List<PublicCoding> getPublicCodingFromXml(String xml) throws Exception {
		System.out.println("进入getPublicCodingFromXml!");
		System.out.println(xml);
		List<PublicCoding> listInfos = new ArrayList<>();
		Document document = DocumentHelper.parseText(xml);
		Element root = document.getRootElement();
		List<Element> firstelements = root.elements();
		for (Iterator<Element> it = firstelements.iterator(); it.hasNext();) {
			Element firstelem = it.next();
			if (firstelem.getName() == "ROW") {
				PublicCoding publicCoding = new PublicCoding();
				List<Element> secondelements = firstelem.elements();
				for (Iterator<Element> its = secondelements.iterator(); its.hasNext();) {
					Element element = its.next();
					List<Attribute> attributes = element.attributes();
					for (int i = 0; i < attributes.size(); i++) {
						Attribute attribute = attributes.get(i);
						if ("GENCODEID".equals(attribute.getText())) {
							publicCoding.setGencodeid(element.getData().toString());
						}
						if ("VALUE".equals(attribute.getText())) {
							publicCoding.setValue(element.getData().toString());
						}
						if ("NAME".equals(attribute.getText())) {
							publicCoding.setName(element.getData().toString());
						}
						if ("TYPE".equals(attribute.getText())) {
							publicCoding.setType(element.getData().toString());
						}
						if ("PARENTID".equals(attribute.getText())) {
							publicCoding.setParentid(element.getData().toString());
						}
						if ("GDESC".equals(attribute.getText())) {
							publicCoding.setGdesc(Integer.valueOf(element.getData().toString()));
						}
						if ("ISDELETE".equals(attribute.getText())) {
							publicCoding.setIsdelete(new Short(element.getData().toString()));
						}
					}
				}
				listInfos.add(publicCoding);
			}
		}
		return listInfos;
	}

}
