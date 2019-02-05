package no.hvl.dat110.system.controller;

import no.hvl.dat110.messaging.Message;
import no.hvl.dat110.messaging.MessageConfig;
import no.hvl.dat110.rpc.*;

public class Display extends RPCStub {

	private byte RPCID = 1;

	public void write(String message) {

		// TODO
		// implement marshalling, call and unmarshalling for write RPC method

		byte[] b;
				
		b = RPCUtils.marshallInteger(RPCID, Integer.parseInt(message));
		
		byte[] newMessage = rmiclient.call(b);
		
		int newInt = RPCUtils.unmarshallInteger(newMessage);
		
		System.out.println(newInt);
		
	}
}