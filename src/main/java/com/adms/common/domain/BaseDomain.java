package com.adms.common.domain;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4149737184353745873L;

	public BaseDomain()
	{

	}

}
