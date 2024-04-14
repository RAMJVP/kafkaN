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
				
				"https://drive.google.com/file/d/11cdKBNnpWZkN8RIij1OZ-pv5qQQxzNA6/view?usp=drivesdk",
				"https://drive.google.com/file/d/1nzDd-BAcgE0tDIFpvUmDUoeTMxbLrz_M/view?usp=drivesdk",
				"https://drive.google.com/file/d/1R8TWs6pDIMmLb5YAXoWSW5IGcy5QQ8OK/view?usp=drivesdk",
				"https://drive.google.com/file/d/1ouzuQ45yVEQGfMRKAiGl5xmMuw83M3to/view?usp=drivesdk",
				"https://drive.google.com/file/d/15fI7jTubNN_9xe4o8p2gOxuCgWw-ZTLN/view?usp=drivesdk",
				"https://drive.google.com/file/d/1D63s3_08_CrgToY278mvgAKajcWqYRj3/view?usp=drivesdk",
				"https://drive.google.com/file/d/1HIkJ0DNC-RHDtM4dX6DHUykcP16cpm0C/view?usp=drivesdk",
				"https://drive.google.com/file/d/16UTHl439YLY7Qdo-fXjVS0MlV7AtMRaw/view?usp=drivesdk",
				"https://drive.google.com/file/d/1kqqS6ZPGTk7kluSjL49qVbo1YhRGG41-/view?usp=drivesdk",
				"https://drive.google.com/file/d/12uEcGJpRsvX6LPu7EOJzdK6lspZG80BM/view?usp=drivesdk",
				"https://drive.google.com/file/d/1ag40YcCN1NFTYjHpEIaK7eKzzbLxN_HM/view?usp=drivesdk",
				"https://drive.google.com/file/d/1W6L9RGHxHLCw3GP4iqP41jN5tpfSlsh9/view?usp=drivesdk",
				"https://drive.google.com/file/d/1nFwtIsZ7eY94rKMJ81q81PDGA_ypGO11/view?usp=drivesdk",
				"https://drive.google.com/file/d/1mQ0y0Df_MoamoUVRZefGZtD-KwpBhukx/view?usp=drivesdk",
				"https://drive.google.com/file/d/1rVnPdWfMyTLVtHCcZWJ4_3nNR9hzZKH0/view?usp=drivesdk",
				"https://drive.google.com/file/d/1golOwByT5RBF2k6e8yXtJH6nrYYV1cV1/view?usp=drivesdk",
				"https://drive.google.com/file/d/1MwiUg75PtYCWTpjdGzqw8ucrU7xnddqJ/view?usp=drivesdk",
				"https://drive.google.com/file/d/1QPSOV80x6YU58DKTfh5WkOm9KJrC-WgD/view?usp=drivesdk",
				"https://drive.google.com/file/d/1cvfKE5eLCNqO5AIuHJu648Y_244uDur6/view?usp=drivesdk",
				"https://drive.google.com/file/d/1XlJRbH7hF0ayUns_l3xAkowmm99V_Iz2/view?usp=drivesdk",
				"https://drive.google.com/file/d/1ybYRRMB0-tmtEXffELE7eOx9btL4OVeh/view?usp=drivesdk",
				"https://drive.google.com/file/d/1DZ40sm1p4apFItTATlYTh_ttPYwsh4z0/view?usp=drivesdk",
				"https://drive.google.com/file/d/1fjgYf0WL2n-FAwPEgphuCklTdRQp-nFR/view?usp=drivesdk",
				"https://drive.google.com/file/d/1V4kGXuGM5phgWm47gOQdSLDWcgs5F2sZ/view?usp=drivesdk",
				"https://drive.google.com/file/d/1uQPgoFkfl4nVifosWrgeUC5FxS5Ldg98/view?usp=drivesdk",
				"https://drive.google.com/file/d/197eZg17dT_I5rx132lHv-Lpg1dL410ls/view?usp=drivesdk",
				"https://drive.google.com/file/d/19Qkm8O4H4kgQdvxNUJUjsn4KUvJfThtg/view?usp=drivesdk",
				"https://drive.google.com/file/d/14Ha0j1euUIeOiYNC-nU9BjsriVqarXyg/view?usp=drivesdk",
				"https://drive.google.com/file/d/1ui6CICKwLunqDcHfMyOBJH0gDliF1fWC/view?usp=drivesdk",
				"https://drive.google.com/file/d/1LNQtasdVJMMY2NT-bhYgLB07PxSQE95b/view?usp=drivesdk",
				"https://drive.google.com/file/d/1V5v6exm9rvnQCTY2Qo8wPJeqZgFU0PYL/view?usp=drivesdk",
				"https://drive.google.com/file/d/1NhS_MU9vtGcFHYgkvq_as_NJjEBzVUTO/view?usp=drivesdk",
				"https://drive.google.com/file/d/1XUzdti1MWFJeS9hI5_QdJjOKbDJwxEzA/view?usp=drivesdk",
				"https://drive.google.com/file/d/195pt-N_GlmeM1z-G3X7nvr2kOe7VfhWM/view?usp=drivesdk",
				"https://drive.google.com/file/d/1gFohx4LuSYhzdUOZr80YH0iqgdkI3uK5/view?usp=drivesdk",
				"https://drive.google.com/file/d/1j5uNmQqa2dtGGMqrqpYjLpGis989D5SJ/view?usp=drivesdk",
				"https://drive.google.com/file/d/1x9bZOFlX1AKycylFGVR-nXH-hnUoeIiD/view?usp=drivesdk",
				"https://drive.google.com/file/d/1Xvq-oSyOlNQ7RUFfEZN3DcN70tU6Px_o/view?usp=drivesdk",
				"https://drive.google.com/file/d/1LTzkWtffDlYz3RhVapObX6SAvWZyxO_D/view?usp=drivesdk",
				"https://drive.google.com/file/d/1_M31O2MA3vaOPeJ-bMsH9PfGjXBpW0aK/view?usp=drivesdk",
				"https://drive.google.com/file/d/1SvuARnAKiZ9CjTGs_TsRa9CtN-cgT9sK/view?usp=drivesdk",
				"https://drive.google.com/file/d/10qu5cf6kJWwaJtgD-Q2w-kC5wJbYWxDt/view?usp=drivesdk",
				"https://drive.google.com/file/d/1LRiMDeBYQlKOvEl5DDcZcWvufnowen83/view?usp=drivesdk",
				"https://drive.google.com/file/d/1aLpOJyLuxjFRi7Z2MFaZukXM307D0ko7/view?usp=drivesdk",
				"https://drive.google.com/file/d/1tdZvu8_uNWaGoG39MqI9mRNoRyMG-QfF/view?usp=drivesdk",
				"https://drive.google.com/file/d/1qk1a9jBNwZYkSHoWW9r6cxXbZ93wddpi/view?usp=drivesdk",
				"https://drive.google.com/file/d/1IwQrrtz-YuaI_UdXEFBVQ_q4CQdVWe3S/view?usp=drivesdk",
				"https://drive.google.com/file/d/1BCJRNMAuKln9yQ7p893jbikDfE_v5t73/view?usp=drivesdk",
				"https://drive.google.com/file/d/1BJH5d72PQWcdUZ5g8c5ie2fMep1lXEM4/view?usp=drivesdk",
				"https://drive.google.com/file/d/1qZUQfH1w7P5R3pCwBBR9fCy-u87Npggr/view?usp=drivesdk",
				"https://drive.google.com/file/d/1m19xIqPfWcT9IzOOCSLTh8BFKO1ucUCr/view?usp=drivesdk",
				"https://drive.google.com/file/d/1gAYd-j-254xkA6dc8TC9HOpuEMh-M1K0/view?usp=drivesdk"
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
