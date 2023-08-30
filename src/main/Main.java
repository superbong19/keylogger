package main;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;


public class Main implements NativeKeyListener{
	
	public static void main(String[] args) throws NativeHookException {

		GlobalScreen.registerNativeHook();
		GlobalScreen.addNativeKeyListener(new Main());

	}
	public void nativeKeyPressed(NativeKeyEvent e) {
		
		String key = NativeKeyEvent.getKeyText(e.getKeyCode());
		try 
		{
			
			System.out.println(key);
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
