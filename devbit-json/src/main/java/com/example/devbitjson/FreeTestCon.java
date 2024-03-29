package com.example.devbitjson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.core.model.Root;

@RestController
public class FreeTestCon {

	int i = 0;

	@GetMapping("freerest/{pn}")
	public List<Photo> listRest(@PathVariable("pn") int pn) {
		System.out.println("req###" + pn);

		System.out.println("req" + i++);
		
		List<String> urls= Arrays.asList(
				
				"https://drive.google.com/file/d/164WvK3bch87Ww8iorDQgfya_8Lp4iUU5/view?usp=drive_link",
				"https://drive.google.com/file/d/12ZQLQ0awvomB3pQZH8A-KgmEWiqOFK2q/view?usp=drivesdk",
				"https://drive.google.com/file/d/1hIoC29ZUd80XVDBJWMG5G4gBNlxJAA_p/view?usp=drivesdk",
				"https://drive.google.com/file/d/1LvkKThPEUhL-TXeSvygNNF0m7KzBfxTA/view?usp=drivesdk",
				"https://drive.google.com/file/d/17LWygmBwT6sq1fxz2lktTpIp8NsVfdtn/view?usp=drivesdk",
				"https://drive.google.com/file/d/10ySx6Fegis4prU_f-b57DEhck8gq5n2S/view?usp=drivesdk",
				"https://drive.google.com/file/d/1jDqWbct1ixC9-Aym22PG4Q81in7_Rx0z/view?usp=drivesdk",
				"https://drive.google.com/file/d/1UyukdhIC-h80BWlrdepEY5zC_UuRElRB/view?usp=drivesdk",
				"https://drive.google.com/file/d/11R5lD8aXUObO9WeShvEsj_VTYTomr4Xf/view?usp=drivesdk",
				"https://drive.google.com/file/d/12843DVS7lj87dMe5wv5mFNtQcfvJhc3V/view?usp=drivesdk",
				"https://drive.google.com/file/d/1nZMMAf5sXIPkhRCPDvgeiplUIgjWvdiq/view?usp=drivesdk",
				"https://drive.google.com/file/d/1zfb6kPpUiEKJwh0qhmj-yeK23Cezf384/view?usp=drivesdk",
				"https://drive.google.com/file/d/1aGLwKtpCcfrzUt5hIbMAtBaGyCNueSq2/view?usp=drivesdk",
				"https://drive.google.com/file/d/1SsAi3lsB2V7wf_sIY-jOlipG_FKvfQwf/view?usp=drivesdk",
				"https://drive.google.com/file/d/122u08a_3uj3e_7o7e1HSPU6TIH03sXRp/view?usp=drivesdk",
				"https://drive.google.com/file/d/1mfH-y9kiMhjL2Ly8Z1vYYUvTsD4kRWCz/view?usp=drivesdk",
				"https://drive.google.com/file/d/17LyQ2duNH19ywYAB91W69-IJUAhgO9yU/view?usp=drivesdk",
				"https://drive.google.com/file/d/1sgB1mTP5bH24RpGWRUeOu-GTEb5m6eJX/view?usp=drivesdk",
				"https://drive.google.com/file/d/1whGrtm866fXOWbOMY0IVcjokrTD6hu1J/view?usp=drivesdk",
				"https://drive.google.com/file/d/1dqFxnHqjBonkgi1qAtZRsg0rtbrbZM7X/view?usp=drivesdk",
				"https://drive.google.com/file/d/1lH0E9kGvO_0PBoRlbMmIU-cLpANWWYB7/view?usp=drivesdk",
				"https://drive.google.com/file/d/1lqJriGCdHIE8NeQQMYDtnNLtlvS6XBXx/view?usp=drivesdk",
				"https://drive.google.com/file/d/19augrA4h6vH9o6_QF0I0MAcC3Vv_P8o6/view?usp=drivesdk",
				"https://drive.google.com/file/d/1M3HFcoDFMG8UP_RGxCDcCfTqMF9oZ8aA/view?usp=drivesdk",
				"https://drive.google.com/file/d/1Al8N1zXa55Sf5BU1muzfa7HYTL6iqHLC/view?usp=drivesdk",
				"https://drive.google.com/file/d/164WvK3bch87Ww8iorDQgfya_8Lp4iUU5/view?usp=drivesdk",
				"https://drive.google.com/file/d/1oUahlT4hpyy4ekhVVMSax-ugtkDEcodI/view?usp=drivesdk",
				"https://drive.google.com/file/d/196Kocyb0XA2SfSGtVFqMy7gsqFSgEANB/view?usp=drive_link",
				"https://drive.google.com/file/d/1LARv1KodhjLFhWUDmAacOL5h_yHSrUhC/view?usp=sharing",
				"https://drive.google.com/file/d/1eApwjWywyaT57duvn9wEPkrMmoqUPeW8/view?usp=drive_link",
				"https://drive.google.com/file/d/1oUahlT4hpyy4ekhVVMSax-ugtkDEcodI/view?usp=drive_link"
				);
		
		
				/*
				 * "https://drive.google.com/uc?export=view&id=1y6UxV-quYC_gIpqjPwGvKR5gShcT1ZbK",
				 * "https://drive.google.com/uc?export=view&id=1f1sHjZMdrBlAXR3XDAoEStJ-qNRj25sM",
				 * "https://drive.google.com/uc?export=view&id=14GGY17j6Q2_NOo8zIqO0FdloIER3ULir",
				 */
		
	
		
		List<Photo> pList=IntStream.range(0, urls.size()).collect(()->new ArrayList<Photo>(), (list,i)->{
			Photo p4=new Photo();
			p4.setId(i);
			p4.setUrl(urls.get(i));
			list.add(p4);
			
		},(l1,l2)->l1.addAll(l2));
		
		
		
		
		
	//	int pn=3;
		
		int start=(pn-1)*12;
		
		
		int end=pn*12;
		
		
		if(start>pList.size()) {
			System.err.println("No image left");
			start=pList.size();
		}
		if(end>pList.size()) {
			end=pList.size();
		}
		
		return pList.subList(start, end);
	
	}
	
	
	
	
	@GetMapping("delete/{emailid}")
	public boolean delete(@PathVariable("emailid") int emailId) {
		
		System.out.println("Request received for delete " + emailId);
		return true; 
	}

	
	
	
	

	@GetMapping("listImg")
	public List<Photo> listImg() {

		System.out.println("req" + i++);

		List<Photo> pList = new ArrayList<Photo>();

		Photo p = new Photo();
		p.setId(0);
		p.setUrl("https://drive.google.com/uc?export=view&id=1y6UxV-quYC_gIpqjPwGvKR5gShcT1ZbK");
		Photo p1 = new Photo();
		p1.setId(1);
		p1.setUrl("https://drive.google.com/uc?export=view&id=1f1sHjZMdrBlAXR3XDAoEStJ-qNRj25sM");

		Photo p2 = new Photo();
		p2.setId(2);
		p2.setUrl("https://drive.google.com/uc?export=view&id=14GGY17j6Q2_NOo8zIqO0FdloIER3ULir");

		pList.add(p);
		pList.add(p1);
		pList.add(p2);
		return pList;

	}

	@Autowired
	private Serv serv;

	@GetMapping("gdrive/images")
	public List<Photo> imagesGdrive() {
		return serv.getAllProducts();
	}

	@GetMapping("gdrive1/images")
	public List<Root> imagesGdrive1() {
		return serv.getProducts();
	}
	
	
	
	

}
