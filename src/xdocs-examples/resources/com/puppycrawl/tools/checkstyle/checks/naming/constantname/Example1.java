/*
ConstantName
format = (default)^[A-Z][A-Z0-9]*(_[A-Z0-9]+)*$
applyToPublic = (default)true
applyToProtected = (default)true
applyToPackage = (default)true
applyToPrivate = (default)true


*/

package com.puppycrawl.tools.checkstyle.checks.naming.constantname;

class Example1 {
  public final static int FIRST_CONSTANT1 = 10;
  protected final static int SECOND_CONSTANT2 = 100;
  final static int third_Constant3 = 1000; // violation 'must match pattern'
  private final static int fourth_Const4 = 50; // violation 'must match pattern'
  public final static int log = 10; // violation 'must match pattern'
  protected final static int logger = 50; // violation 'must match pattern'
  final static int loggerMYSELF = 5; // violation 'must match pattern'
  final static int MYSELF = 100;
  protected final static int myselfConstant = 1; // violation 'must match pattern'
}
