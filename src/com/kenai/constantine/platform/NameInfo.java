// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Sat May 02 18:23:32 +1000 2009
package com.kenai.constantine.platform;
public enum NameInfo implements com.kenai.constantine.Constant {
NI_MAXHOST,
NI_MAXSERV,
NI_NOFQDN,
NI_NUMERICHOST,
NI_NAMEREQD,
NI_NUMERICSERV,
NI_DGRAM,
NI_WITHSCOPEID,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<NameInfo> resolver = 
ConstantResolver.getResolver(NameInfo.class, 20000, 29999);
public final int value() { return resolver.intValue(this); }
public final String description() { return resolver.description(this); }
public final String toString() { return description(); }
public final static NameInfo valueOf(int value) { 
    return resolver.valueOf(value);
}
}
