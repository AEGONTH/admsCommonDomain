package com.adms.common.domain;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class CountableDomain extends BaseDomain {

	private static final long serialVersionUID = 4670756542151664128L;

	public CountableDomain()
	{
		
	}
	
	public abstract Long getTotalCount();

}
