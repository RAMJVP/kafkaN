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
				
				
				"https://drive.google.com/file/d/1TPWp6LNQwXJKCG8B7GDoTwhJ49X5OhHY/view?usp=drivesdk",
				"https://drive.google.com/file/d/1kkRJ_r8v687oD5cFOvWx9rpaKkPZ1LuY/view?usp=drivesdk",
				"https://drive.google.com/file/d/1slGf9yhF2YCyGzFrpyJWc6G9CQgImoj7/view?usp=drivesdk",
				"https://drive.google.com/file/d/132Ft8sVuzgOCO7DzfstBKHdXIe6bZplM/view?usp=drivesdk",
				"https://drive.google.com/file/d/1088QbunD92RlvgOMERsGP0aajxMvvev3/view?usp=drivesdk",
				"https://drive.google.com/file/d/13Tpm1ml-ZZ77OR9ZIo8mINe9diRzOiHK/view?usp=drivesdk",
				"https://drive.google.com/file/d/189x5nGE_dBwCvJio4lqjj36fth3V3koN/view?usp=drivesdk",
				"https://drive.google.com/file/d/1w04VIPahhQ-xGYCJmB3Ic1LFagvmQTPx/view?usp=drivesdk",
				"https://drive.google.com/file/d/1hACeDHS4nMZLvEPJC0OLZvwnc45aOxox/view?usp=drivesdk",
				"https://drive.google.com/file/d/1GIbQXWap96rvjcki_a5-Bf6OXNchNNBP/view?usp=drivesdk",
				"https://drive.google.com/file/d/1ZZOFdglZMgcbs_8UQrty2dSeaDKVSO2C/view?usp=drivesdk",
				"https://drive.google.com/file/d/1mhc4zKVTwYu6-_pKhqjMsroVaHq8Zq2P/view?usp=drivesdk",
				"https://drive.google.com/file/d/1L1T_Zo4rdPGahoPQWzcFhNnTJHx_ZHrs/view?usp=drivesdk",
				"https://drive.google.com/file/d/1lQ6yWGsT8xUyR27uM0EssWk7Nh9kqSQb/view?usp=drivesdk",
				"https://drive.google.com/file/d/1qwAfBbfLNznolBfXgRT3BbHWRgn8xkex/view?usp=drivesdk",
				"https://drive.google.com/file/d/1wyfktbztt0i-XIFhx4_MKhMJw93fPJ8K/view?usp=drivesdk",
				"https://drive.google.com/file/d/1zjYrjRumuHejyGgYGVY-dizZ4bDtJAgz/view?usp=drivesdk",
				"https://drive.google.com/file/d/10pqu0Cd4bon6WYZxxJUoobr6kaxOfdcP/view?usp=drivesdk",
				"https://drive.google.com/file/d/1QVTXJqoXHJ4sDQDdvCv9ipfAATsPyIFY/view?usp=drivesdk",
				"https://drive.google.com/file/d/1DZf7nkHr_fijr1KoyNxGLgr56boiRhJk/view?usp=drivesdk",
				"https://drive.google.com/file/d/1jkJ-24XsCvZNk7YrnGIFOyO5ngL8i1gt/view?usp=drivesdk",
				"https://drive.google.com/file/d/1eGPxh6O9qmjBzVxzgHun_SJtjk63ndPZ/view?usp=drivesdk",
				"https://drive.google.com/file/d/1pbbPWSxLsu_J_i0qJX-CKcsyvW3XmeZ9/view?usp=drivesdk",
				"https://drive.google.com/file/d/1zWAISp0Ldx_g3_IAIQBArwGuoSeD-D5D/view?usp=drivesdk",
				"https://drive.google.com/file/d/1mt_MISLgovEPHTs7GsRyt3vNx8Nzg8Q6/view?usp=drivesdk",
				"https://drive.google.com/file/d/1RpnLqk3mu_BBdeH6djTd1Dmq1gCSJsIV/view?usp=drivesdk",
				"https://drive.google.com/file/d/1BsmDYQ4mQapdhyJlPL7gV6d-6ORrI1en/view?usp=drivesdk",
				"https://drive.google.com/file/d/1uEDtgpAxxl-rqjv7KYhdvhC-sbtlh8ce/view?usp=drivesdk",
				"https://drive.google.com/file/d/17edtJVwtQsQrSxgHLwoI-yEZTQAyje9u/view?usp=drivesdk",
				"https://drive.google.com/file/d/1PVxd6FuySz-z9woui8rIDBcoBzaF5ao5/view?usp=drivesdk",
				"https://drive.google.com/file/d/1X83w5EBuc_bSJZgtJ7ybUuzIFWP580ri/view?usp=drivesdk",
				"https://drive.google.com/file/d/1IxAPEpedE45aMleuvbyJtI4aAlnWolh7/view?usp=drivesdk",
				"https://drive.google.com/file/d/1X-8ECWnb4h9ch8iK4oWHmSUpmDUUnn3L/view?usp=drivesdk",
				"https://drive.google.com/file/d/18ezRC0gwh6_E-nok7d7srYb3tiWu3W6c/view?usp=drivesdk",
				"https://drive.google.com/file/d/1Ywoq0O7OmbuyUVPrLxBLd0CnBIkx9Caz/view?usp=drivesdk",
				"https://drive.google.com/file/d/1WpZftAZ7YXY04jxooYWlfpY_VUj5tbNu/view?usp=drivesdk",
				"https://drive.google.com/file/d/1qVBOM4IvX7wugwuQD3cd-HTIVGlHVCWG/view?usp=drivesdk",
				"https://drive.google.com/file/d/1M0p1aUwtssPPoCLfnqxr8yEQ_PhgMchF/view?usp=drivesdk",
				"https://drive.google.com/file/d/1LCK6mC0X0caULUvOClvGo6xAeLVOtotS/view?usp=drivesdk",
				"https://drive.google.com/file/d/1KXxQmn67iSrC1L6BGuJgNXtWiqbEdx3m/view?usp=drivesdk"
				
				
				
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
