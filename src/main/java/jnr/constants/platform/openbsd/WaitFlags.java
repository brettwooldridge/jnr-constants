// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Wed Feb 25 18:33:26 +1000 2009
package jnr.constants.platform.openbsd;
public enum WaitFlags implements jnr.constants.Constant {
WNOHANG(0x1),
WUNTRACED(0x2),
WSTOPPED(0x7f),
// WEXITED not defined
WCONTINUED(0x8);
// WNOWAIT not defined
private final int value;
private WaitFlags(int value) { this.value = value; }
public static final long MIN_VALUE = 0x1;
public static final long MAX_VALUE = 0x7f;

public final int value() { return value; }
public final int intValue() { return value; }
public final long longValue() { return value; }
public final boolean defined() { return true; }
}
