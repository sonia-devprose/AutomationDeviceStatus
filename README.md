# Automation Device Status Manager

This Java project provides a simple implementation of a **Device Status Management System** using an `enum` to represent and manage the states of devices in an automation setup. It demonstrates how to track and query the status of devices like lights and fans in a binary-flagged manner.

## Features

- **Enum-based State Management**: Represents device states (`ALL_OFF`, `LIGHT_ON`, `FAN_ON`, `BOTH_ON`) with binary flags for efficient state representation and checking.
- **State Descriptions**: Provides human-readable descriptions of the current state.
- **Device Activity Checking**: Allows querying whether specific devices (light or fan) are active in the current state.

## Enum Constants and Flags

- `ALL_OFF` (`0b000`): All devices are off.
- `LIGHT_ON` (`0b001`): Only the light is on.
- `FAN_ON` (`0b010`): Only the fan is on.
- `BOTH_ON` (`0b011`): Both light and fan are on.

## Example Usage

- **Current State Description**: Displays the state description for each device status.
- **Query Device Activity**: Checks whether specific devices are active using a bitwise operation.

### Sample Output

```text
Current state: All devices are off
Current state: Light is on
Current state: Fan is on
Current state: All devices are on
Is Light active? Yes
Is Fan active? Yes
```

## How It Works

1. **Enum Initialization**: The `DeviceStatus` enum defines states with binary flags and descriptions.
2. **State Transition**: Update the current state to reflect changes in device status.
3. **Activity Check**: Use the `isActive` method to determine if specific devices are on.

---

This project is a great foundation for more complex automation systems. Extend it to manage additional devices or integrate it with hardware for real-world automation tasks.
