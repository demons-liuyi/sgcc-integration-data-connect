package com.sgcc.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;

import com.sgcc.mapper.MarketMemberMapper;
import com.sgcc.mapper.MonthlyDecomposeMapper;
import com.sgcc.mapper.PlContractMapper;
import com.sgcc.mapper.PlGenUnitRelationMapper;
import com.sgcc.mapper.PlPhysicalGenMapper;
import com.sgcc.mapper.PlSettleUnitMapper;
import com.sgcc.mapper.PublicCodingMapper;
import com.sgcc.mapper.TLtsSettlementBasicMapper;
import com.sgcc.po.MarketMember;
import com.sgcc.po.MarketMemberExample;
import com.sgcc.po.MonthlyDecompose;
import com.sgcc.po.MonthlyDecomposeExample;
import com.sgcc.po.PlContract;
import com.sgcc.po.PlContractExample;
import com.sgcc.po.PlGenUnitRelation;
import com.sgcc.po.PlGenUnitRelationExample;
import com.sgcc.po.PlPhysicalGen;
import com.sgcc.po.PlPhysicalGenExample;
import com.sgcc.po.PlSettleUnit;
import com.sgcc.po.PlSettleUnitExample;
import com.sgcc.po.PublicCoding;
import com.sgcc.po.PublicCodingExample;
import com.sgcc.po.TLtsSettlementBasic;
import com.sgcc.po.TLtsSettlementBasicExample;
import com.sgcc.service.IWebService;
import com.sgcc.util.XmlToJsonUtil;

public class IWebServiceImpl implements IWebService{

	@Autowired
	MarketMemberMapper marketMemberMapper;

	@Autowired
	PlPhysicalGenMapper plPhysicalGenMapper;

	@Autowired
	PlSettleUnitMapper plSettleUnitMapper;

	@Autowired
	PlContractMapper plContractMapper;

	@Autowired
	MonthlyDecomposeMapper monthlyDecomposeMapper;

	@Autowired
	PlGenUnitRelationMapper plGenUnitRelationMapper;
	
	@Autowired
	TLtsSettlementBasicMapper tLtsSettlementBasicMapper;
	
	@Autowired
	PublicCodingMapper publicCodingMapper;

	@Autowired
	XmlToJsonUtil xmlToJsonUtil;

	@Override
	public String marketMember(String data) {
		// TODO Auto-generated method stub
		System.out.println("web services调用成功!");
		System.out.println(data);
		String str = data.substring(1, data.length() - 1);
		int a = 0;
		int b = 0;
		int c = str.lastIndexOf("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		System.out.println(c);
		String xml = str.substring(c);
		System.out.println("字符串："+xml);
		List<MarketMember> list = new ArrayList<MarketMember>();
		try {
			list = xmlToJsonUtil.getMarketMemberFromXml(xml);
			System.out.println("获取成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "MarketMember录入失败!"+e;
		}
		System.out.println(list.size());
		List<MarketMember> queryList = marketMemberMapper.selectByExample(null);
		try {
			for (MarketMember x : list) {
				boolean bool = true;
				for (MarketMember y : queryList) {
					if (x.getId().equals(y.getId())) {
						System.out.println("进入修改");
						bool = false;
						MarketMemberExample example = new MarketMemberExample();
						example.createCriteria().andIdEqualTo(x.getId());
						a += marketMemberMapper.updateByExample(x, example);
						break;
					}
				}
				if (bool == true) {
					System.out.println("进入新增");
					b += marketMemberMapper.insert(x);
				}
			}
			return "MarketMember录入成功!新增" + b + "条数据!修改" + a + "条数据!";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("失败!");
			return "MarketMember录入失败!"+e;
		} finally {
			System.out.println("修改" + a + "条数据!");
			System.out.println("新增" + b + "条数据!");
		}
	}

	@Override
	public String plPhysicalGen(String data) {
		// TODO Auto-generated method stub
		System.out.println("web services调用成功!");
		System.out.println(data);
		String str = data.substring(1, data.length() - 1);
		int a = 0;
		int b = 0;
		int c = str.lastIndexOf("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		System.out.println(c);
		String xml = str.substring(c);
		List<PlPhysicalGen> list = new ArrayList<PlPhysicalGen>();
		try {
			list = xmlToJsonUtil.getPlPhysicalGenFromXml(xml);
			System.out.println("获取成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "plPhysicalGen录入失败!"+e;
		}	
		System.out.println(list.size());
		List<PlPhysicalGen> queryList = plPhysicalGenMapper.selectByExample(null);
		System.out.println(queryList.size());
		try {
			for (PlPhysicalGen x : list) {
				System.out.println(x.getGenId());
				boolean bool = true;
				for (PlPhysicalGen y : queryList) {
					System.out.println(x.getGenId());
					System.out.println(y.getGenId());
					if (x.getGenId().equals(y.getGenId())) {
						System.out.println("进入修改");
						bool = false;
						PlPhysicalGenExample example = new PlPhysicalGenExample();
						example.createCriteria().andGenIdEqualTo(x.getGenId());
						a += plPhysicalGenMapper.updateByExample(x, example);
						break;
					}
				}
				if (bool == true) {
					b += plPhysicalGenMapper.insert(x);
				}
			}
			return "plPhysicalGen录入成功!新增" + b + "条数据!修改" + a + "条数据!";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("失败!");
			return "plPhysicalGen录入失败!"+e;
		} finally {
			System.out.println("修改" + a + "条数据!");
			System.out.println("新增" + b + "条数据!");
		}
	}

	@Override
	public String plSettleUnit(String data) {
		// TODO Auto-generated method stub
		System.out.println("web services调用成功!");
		System.out.println(data);
		String str = data.substring(1, data.length() - 1);
		int a = 0;
		int b = 0;
		int c = str.lastIndexOf("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		System.out.println(c);
		String xml = str.substring(c);
		List<PlSettleUnit> list = new ArrayList<PlSettleUnit>();
		try {
			list = xmlToJsonUtil.getPlSettleUnitFromXml(xml);
			System.out.println("获取成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "PlSettleUnit录入失败!"+e;
		}
		System.out.println(list.size());
		List<PlSettleUnit> queryList = plSettleUnitMapper.selectByExample(null);
		try {
			for (PlSettleUnit x : list) {
				boolean bool = true;
				for (PlSettleUnit y : queryList) {
					if (x.getSettleId().equals(y.getSettleId())) {
						System.out.println("进入修改");
						bool = false;
						PlSettleUnitExample example = new PlSettleUnitExample();
						example.createCriteria().andSettleIdEqualTo(x.getSettleId());
						a += plSettleUnitMapper.updateByExample(x, example);
						break;
					}
				}
				if (bool == true) {
					System.out.println("进入新增");
					b += plSettleUnitMapper.insert(x);
				}
			}
			return "PlSettleUnit录入成功!新增" + b + "条数据!修改" + a + "条数据!";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("失败!");
			return "PlSettleUnit录入失败!"+e;
		} finally {
			System.out.println("修改" + a + "条数据!");
			System.out.println("新增" + b + "条数据!");
		}
	}

	@Override
	public String plContract(String data) {
		// TODO Auto-generated method stub
		System.out.println("web services调用成功!");
		System.out.println(data);
		String str = data.substring(1, data.length() - 1);
		int a = 0;
		int b = 0;
		int c = str.lastIndexOf("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		System.out.println(c);
		String xml = str.substring(c);
		List<PlContract> list = new ArrayList<PlContract>();
		try {
			list = xmlToJsonUtil.getPlContractFromXml(xml);
			System.out.println("获取成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "PlContract录入失败!"+e;
		}
		System.out.println(list.size());
		List<PlContract> queryList = plContractMapper.selectByExample(null);
		try {
			for (PlContract x : list) {
				boolean bool = true;
				for (PlContract y : queryList) {
					if (x.getContractId().equals(y.getContractId())) {
						System.out.println("进入修改");
						bool = false;
						PlContractExample example = new PlContractExample();
						example.createCriteria().andContractIdEqualTo(x.getContractId());
						a += plContractMapper.updateByExample(x, example);
						break;
					}
				}
				if (bool == true) {
					System.out.println("进入新增");
					b += plContractMapper.insert(x);
				}
			}
			return "PlContract录入成功!新增" + b + "条数据!修改" + a + "条数据!";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("失败!");
			return "PlContract录入失败!"+e;
		} finally {
			System.out.println("修改" + a + "条数据!");
			System.out.println("新增" + b + "条数据!");
		}
	}

	@Override
	public String monthlyDecompose(String data) {
		// TODO Auto-generated method stub
		System.out.println("web services调用成功!");
		System.out.println(data);
		String str = data.substring(1, data.length() - 1);
		int a = 0;
		int b = 0;
		int c = str.lastIndexOf("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		System.out.println(c);
		String xml = str.substring(c);
		List<MonthlyDecompose> list = new ArrayList<MonthlyDecompose>();
		try {
			list = xmlToJsonUtil.getMonthlyDecomposeFromXml(xml);
			System.out.println("获取成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "MonthlyDecompose录入失败!"+e;
		}
		System.out.println(list.size());
		List<MonthlyDecompose> queryList = monthlyDecomposeMapper.selectByExample(null);
		try {
			for (MonthlyDecompose x : list) {
				boolean bool = true;
				for (MonthlyDecompose y : queryList) {
					if (x.getDecomposeId().equals(y.getDecomposeId())) {
						System.out.println("进入修改");
						bool = false;
						MonthlyDecomposeExample example = new MonthlyDecomposeExample();
						example.createCriteria().andDecomposeIdEqualTo(x.getDecomposeId());
						a += monthlyDecomposeMapper.updateByExample(x, example);
						break;
					}
				}
				if (bool == true) {
					System.out.println("进入新增");
					b += monthlyDecomposeMapper.insert(x);
				}
			}
			return "MonthlyDecompose录入成功!新增" + b + "条数据!修改" + a + "条数据!";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("失败!");
			return "MonthlyDecompose录入失败!"+e;
		} finally {
			System.out.println("修改" + a + "条数据!");
			System.out.println("新增" + b + "条数据!");
		}
	}

	@Override
	public String plGenUnitRelation(String data) {
		// TODO Auto-generated method stub
		System.out.println("web services调用成功!");
		System.out.println(data);
		String str = data.substring(1, data.length() - 1);
		int a = 0;
		int b = 0;
		int c = str.lastIndexOf("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		System.out.println(c);
		String xml = str.substring(c);
		List<PlGenUnitRelation> list = new ArrayList<PlGenUnitRelation>();
		try {
			list = xmlToJsonUtil.getPlGenUnitRelationFromXml(xml);
			System.out.println("获取成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "PlGenUnitRelation录入失败!"+e;
		}
		System.out.println(list.size());
		List<PlGenUnitRelation> queryList = plGenUnitRelationMapper.selectByExample(null);
		try {
			for (PlGenUnitRelation x : list) {
				boolean bool = true;
				for (PlGenUnitRelation y : queryList) {
					if (x.getRelationId().equals(y.getRelationId())) {
						System.out.println("进入修改");
						bool = false;
						PlGenUnitRelationExample example = new PlGenUnitRelationExample();
						example.createCriteria().andRelationIdEqualTo(x.getRelationId());
						a += plGenUnitRelationMapper.updateByExample(x, example);
						break;
					}
				}
				if (bool == true) {
					System.out.println("进入新增");
					b += plGenUnitRelationMapper.insert(x);
				}
			}
			return "PlGenUnitRelation录入成功!新增" + b + "条数据!修改" + a + "条数据!";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("失败!");
			return "PlGenUnitRelation录入失败!"+e;
		} finally {
			System.out.println("修改" + a + "条数据!");
			System.out.println("新增" + b + "条数据!");
		}
	}
	
	
	@Override
	public String tLtsSettlementBasic(String data) {
		// TODO Auto-generated method stub
		System.out.println("web services调用成功!");
		System.out.println(data);
		String str = data.substring(1, data.length() - 1);
		int a = 0;
		int b = 0;
		int c = str.lastIndexOf("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		System.out.println(c);
		String xml = str.substring(c);
		List<TLtsSettlementBasic> list = new ArrayList<TLtsSettlementBasic>();
		try {
			list = xmlToJsonUtil.getTLtsSettlementBasicFromXml(xml);
			System.out.println("获取成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "TLtsSettlementBasic录入失败!"+e;
		}
		System.out.println(list.size());
		List<TLtsSettlementBasic> queryList = tLtsSettlementBasicMapper.selectByExample(null);
		try {
			for (TLtsSettlementBasic x : list) {
				boolean bool = true;
				for (TLtsSettlementBasic y : queryList) {
					if (x.getSettleId().equals(y.getSettleId())) {
						System.out.println("进入修改");
						bool = false;
						TLtsSettlementBasicExample example = new TLtsSettlementBasicExample();
						example.createCriteria().andSettleIdEqualTo(x.getSettleId());
						a += tLtsSettlementBasicMapper.updateByExample(x, example);
						break;
					}
				}
				if (bool == true) {
					System.out.println("进入新增");
					b += tLtsSettlementBasicMapper.insert(x);
				}
			}
			return "TLtsSettlementBasic录入成功!新增" + b + "条数据!修改" + a + "条数据!";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("失败!");
			return "TLtsSettlementBasic录入失败!"+e;
		} finally {
			System.out.println("修改" + a + "条数据!");
			System.out.println("新增" + b + "条数据!");
		}
	}

	@Override
	public String publicCoding(String data) {
		// TODO Auto-generated method stub
		System.out.println("web services调用成功!");
		System.out.println(data);
		String str = data.substring(1, data.length() - 1);
		int a = 0;
		int b = 0;
		int c = str.lastIndexOf("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		System.out.println(c);
		String xml = str.substring(c);
		List<PublicCoding> list = new ArrayList<PublicCoding>();
		try {
			list = xmlToJsonUtil.getPublicCodingFromXml(xml);
			System.out.println("获取成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "PublicCoding录入失败!"+e;
		}
		System.out.println(list.size());
		List<PublicCoding> queryList = publicCodingMapper.selectByExample(null);
		try {
			for (PublicCoding x : list) {
				boolean bool = true;
				for (PublicCoding y : queryList) {
					if (x.getGencodeid().equals(y.getGencodeid())) {
						System.out.println("进入修改");
						bool = false;
						PublicCodingExample example = new PublicCodingExample();
						example.createCriteria().andGencodeidEqualTo(x.getGencodeid());
						a += publicCodingMapper.updateByExample(x, example);
						break;
					}
				}
				if (bool == true) {
					System.out.println("进入新增");
					b += publicCodingMapper.insert(x);
				}
			}
			return "PublicCoding录入成功!新增" + b + "条数据!修改" + a + "条数据!";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("失败!");
			return "PublicCoding录入失败!"+e;
		} finally {
			System.out.println("修改" + a + "条数据!");
			System.out.println("新增" + b + "条数据!");
		}
	}
	


}
