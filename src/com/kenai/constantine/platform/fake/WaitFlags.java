// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Sat May 02 18:23:32 +1000 2009
package com.kenai.constantine.platform.fake;
public enum WaitFlags implements com.kenai.constantine.Constant {
WNOHANG(0x1),
WUNTRACED(0x2),
WSTOPPED(0x4),
WEXITED(0x8),
WCONTINUED(0x10),
WNOWAIT(0x20);
private final int value;
private WaitFlags(int value) { this.value = value; }
public static final long MIN_VALUE = 1;
public static final long MAX_VALUE = 0x20;
public final int value() { return value; }
}
