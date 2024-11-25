package com.example.automationdevicestatus;

enum DeviceStatus
{

    // Constants of enum
    ALL_OFF(0b000, "All devices are off"),
    LIGHT_ON (0b001, "Light is on"),
    FAN_ON (0b010, "Fan is on"),
    BOTH_ON (0b011, "All devices are on");
    // Fields for enum (like class)
    private final int flag;
    private final String description;

    // Constructor to initialize flag and description
    DeviceStatus(int flag, String description)
    {
        this.flag = flag;
        this.description = description;
    }

    // Return the description of tghe current state
    public String getDescription ()

    {
        return description;
    }

    // Check if the current device state includes the given device's flag
    public boolean isActive(DeviceStatus state)
    {
        return ((this.flag & state.flag)!= 0);
    }


}



public class AutomationDeviceStatus {

    public static void main (String [] args)

    {
        // Initial state - all devices are off
        DeviceStatus currentState = DeviceStatus.ALL_OFF;
        System.out.println("Current state: " + currentState.getDescription());

        // Light is on
        currentState = DeviceStatus.LIGHT_ON;
        System.out.println("Current state: " + currentState.getDescription());
        // Fan is on
        currentState = DeviceStatus.FAN_ON;
        System.out.println("Current state: " + currentState.getDescription());

        // Both devices are off
        currentState = DeviceStatus.BOTH_ON;
        System.out.println("Current state: " + currentState.getDescription());

        System.out.println("Is Light active? " + (currentState.isActive(DeviceStatus.LIGHT_ON) ? "Yes" : "No"));
        System.out.println("Is Fan active? " + (currentState.isActive(DeviceStatus.FAN_ON) ? "Yes" : "No"));
    }
}
