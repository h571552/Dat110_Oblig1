package no.hvl.dat110.system.controller;

import no.hvl.dat110.messaging.Message;
import no.hvl.dat110.messaging.MessageConfig;
import no.hvl.dat110.rpc.*;

public class Display extends RPCStub {

	private byte RPCID = 1;

	public void write(String message) {

		// TODO
		// implement marshalling, call and unmarshalling for write RPC method

		RPCClient client;
		byte[] b;
		
		client = new RPCClient(Common.DISPLAYHOST, Common.DISPLAYPORT);
		b = RPCUtils.marshallInteger(RPCID, Integer.parseInt(message));
		
		client.connect();
		
		byte[] newMessage = client.call(b);
		
		int newInt = RPCUtils.unmarshallInteger(newMessage);
		
		System.out.println(newInt);
		
		client.disconnect();
		
	}
}