package compositedesignpattern;

import java.util.ArrayList;
import java.util.List;



public class HTMLParentElement {
	

public class HTMLParentElement extends HTMLTag {
	private String tagName;
	private String startTag; 
	private String endTag;
	
	
	public HTMLParentElement(String tagName){
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.childTag = new ArrayList<>();
	}
	public String getTagName() {
		return tagName;
	}

	public void setStartTag(String tag) {
		this.startTag = tag;
	}

	public void setEndTag(String tag) {
		this.endTag = tag;
	}

	public void addChildTag(HTMLTag htmlTag){
		childTag.add(htmlTag);
	}
	
	public void removeChildTag(HTMLTag htmlTag){
		childTag.remove(htmlTag);
	}



	public void generateHtml() {
		System.out.println(startTag);
		for(HTMLTag tag : childTag){
			tag.generateHtml();
		}
		System.out.println(endTag);
		
	}

}

}
