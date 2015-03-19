package cn.submail.sdk.base;

import cn.submail.sdk.entity.DataStore;

public abstract class SenderWapper {

	protected DataStore requestData = new DataStore();

	public abstract ISender getSender();
}
