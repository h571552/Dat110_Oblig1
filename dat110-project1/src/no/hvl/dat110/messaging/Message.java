package no.hvl.dat110.messaging;

import java.util.Arrays;

public class Message {

	private byte[] payload;

	public Message(byte[] payload) {
		this.payload = payload; // TODO: check for length within boundary
	}

	public Message() {
		super();
	}

	public byte[] getData() {
		return this.payload; 
	}

	public byte[] encapsulate() {
		
		byte[] encoded;
		
		// TODO
		// encapulate/encode the payload of the message

		byte length = (byte)payload.length;
		encoded = new byte[128];
		encoded[0] = length;
		
		for(int i = 1; i <= length; i++) {
			encoded[i] = payload[i-1];
		}
		
		return encoded;
		
	}

	public void decapsulate(byte[] received) {

		// TODO
		// decapsulate data in received and put in payload
		
	  byte length = received[0];
	  payload = new byte[length];
	  
	  for(int i = 1; i <= length; i++) {
		  payload[i-1] = received[i];
	  }
		
	}
}
