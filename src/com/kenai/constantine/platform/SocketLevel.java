// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Sat May 02 18:23:31 +1000 2009
package com.kenai.constantine.platform;
public enum SocketLevel implements com.kenai.constantine.Constant {
SOL_SOCKET,
SOL_IP,
SOL_TCP,
SOL_UDP,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<SocketLevel> resolver = 
ConstantResolver.getResolver(SocketLevel.class, 20000, 29999);
public final int value() { return resolver.intValue(this); }
public final String description() { return resolver.description(this); }
public final String toString() { return description(); }
public final static SocketLevel valueOf(int value) { 
    return resolver.valueOf(value);
}
}
