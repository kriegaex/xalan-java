/* Generated By:JJTree&JavaCC: Do not edit this line. XPathConstants.java */
package org.apache.xpath.rwapi.impl.parser;

public interface XPathConstants {

  int EOF = 0;
  int IntegerLiteral = 1;
  int DecimalLiteral = 2;
  int DoubleLiteral = 3;
  int StringLiteral = 4;
  int ExprComment = 5;
  int skip_ = 7;
  int S = 8;
  int AxisChild = 9;
  int AxisDescendant = 10;
  int AxisParent = 11;
  int AxisAttribute = 12;
  int AxisSelf = 13;
  int AxisDescendantOrSelf = 14;
  int AxisAncestor = 15;
  int AxisFollowingSibling = 16;
  int AxisPrecedingSibling = 17;
  int AxisFollowing = 18;
  int AxisPreceding = 19;
  int AxisNamespace = 20;
  int AxisAncestorOrSelf = 21;
  int Or = 22;
  int And = 23;
  int Div = 24;
  int Idiv = 25;
  int Mod = 26;
  int Multiply = 27;
  int In = 28;
  int InContext = 29;
  int Satisfies = 30;
  int Return = 31;
  int Then = 32;
  int Else = 33;
  int To = 34;
  int Intersect = 35;
  int Union = 36;
  int Except = 37;
  int Instanceof = 38;
  int Castable = 39;
  int Item = 40;
  int ElementType = 41;
  int AttributeType = 42;
  int ElementQNameLbrace = 43;
  int AttributeQNameLbrace = 44;
  int ElementLbrace = 45;
  int AttributeLbrace = 46;
  int DefaultCollationEquals = 47;
  int DefaultElement = 48;
  int DefaultFunction = 49;
  int OfType = 50;
  int AtomicValue = 51;
  int TypeQName = 52;
  int Node = 53;
  int Empty = 54;
  int Nmstart = 55;
  int Nmchar = 56;
  int Star = 57;
  int NCNameColonStar = 58;
  int StarColonNCName = 59;
  int Root = 60;
  int RootDescendants = 61;
  int Slash = 62;
  int SlashSlash = 63;
  int Equals = 64;
  int Is = 65;
  int NotEquals = 66;
  int IsNot = 67;
  int LtEquals = 68;
  int LtLt = 69;
  int GtEquals = 70;
  int GtGt = 71;
  int FortranEq = 72;
  int FortranNe = 73;
  int FortranGt = 74;
  int FortranGe = 75;
  int FortranLt = 76;
  int FortranLe = 77;
  int Lt = 78;
  int Gt = 79;
  int Minus = 80;
  int Plus = 81;
  int QMark = 82;
  int Vbar = 83;
  int Lpar = 84;
  int At = 85;
  int Lbrack = 86;
  int Rbrack = 87;
  int Rpar = 88;
  int Some = 89;
  int Every = 90;
  int ForVariable = 91;
  int CastAs = 92;
  int TreatAs = 93;
  int ValidateLbrace = 94;
  int ValidateContext = 95;
  int Digits = 96;
  int Comment = 97;
  int Document = 98;
  int DocumentLbrace = 99;
  int Text = 100;
  int Untyped = 101;
  int ProcessingInstruction = 102;
  int NodeLpar = 103;
  int CommentLpar = 104;
  int TextLpar = 105;
  int ProcessingInstructionLpar = 106;
  int IfLpar = 107;
  int Comma = 108;
  int Dot = 109;
  int DotDot = 110;
  int NCName = 111;
  int Prefix = 112;
  int LocalPart = 113;
  int VariableIndicator = 114;
  int VarName = 115;
  int QName = 116;
  int QNameLpar = 117;
  int Lbrace = 118;
  int LbraceExprEnclosure = 119;
  int Rbrace = 120;
  int Char = 121;
  int WhitespaceChar = 122;
  int Letter = 123;
  int BaseChar = 124;
  int Ideographic = 125;
  int CombiningChar = 126;
  int Digit = 127;
  int Extender = 128;

  int DEFAULT = 0;
  int OPERATOR = 1;
  int NAMESPACEKEYWORD = 2;
  int QNAME = 3;
  int NAMESPACEDECL = 4;
  int XMLSPACE_DECL = 5;
  int ITEMTYPE = 6;
  int VARNAME = 7;
  int ELEMENT_CONTENT = 8;
  int START_TAG = 9;
  int END_TAG = 10;
  int QUOT_ATTRIBUTE_CONTENT = 11;
  int APOS_ATTRIBUTE_CONTENT = 12;
  int CDATA_SECTION = 13;
  int PROCESSING_INSTRUCTION_CONTENT = 14;
  int XML_COMMENT = 15;
  int XQUERY_COMMENT = 16;

  String[] tokenImage = {
    "<EOF>",
    "<IntegerLiteral>",
    "<DecimalLiteral>",
    "<DoubleLiteral>",
    "<StringLiteral>",
    "<ExprComment>",
    "<token of kind 6>",
    "<skip_>",
    "<S>",
    "<AxisChild>",
    "<AxisDescendant>",
    "<AxisParent>",
    "<AxisAttribute>",
    "<AxisSelf>",
    "<AxisDescendantOrSelf>",
    "<AxisAncestor>",
    "<AxisFollowingSibling>",
    "<AxisPrecedingSibling>",
    "<AxisFollowing>",
    "<AxisPreceding>",
    "<AxisNamespace>",
    "<AxisAncestorOrSelf>",
    "\"or\"",
    "\"and\"",
    "\"div\"",
    "\"idiv\"",
    "\"mod\"",
    "\"*\"",
    "\"in\"",
    "\"context\"",
    "\"satisfies\"",
    "\"return\"",
    "\"then\"",
    "\"else\"",
    "\"to\"",
    "\"intersect\"",
    "\"union\"",
    "\"except\"",
    "<Instanceof>",
    "<Castable>",
    "\"item\"",
    "\"element\"",
    "\"attribute\"",
    "<ElementQNameLbrace>",
    "<AttributeQNameLbrace>",
    "<ElementLbrace>",
    "<AttributeLbrace>",
    "<DefaultCollationEquals>",
    "<DefaultElement>",
    "<DefaultFunction>",
    "<OfType>",
    "<AtomicValue>",
    "<TypeQName>",
    "\"node\"",
    "\"empty\"",
    "<Nmstart>",
    "<Nmchar>",
    "\"*\"",
    "<NCNameColonStar>",
    "<StarColonNCName>",
    "\"/\"",
    "\"//\"",
    "\"/\"",
    "\"//\"",
    "\"=\"",
    "\"is\"",
    "\"!=\"",
    "\"isnot\"",
    "\"<=\"",
    "\"<<\"",
    "\">=\"",
    "\">>\"",
    "\"eq\"",
    "\"ne\"",
    "\"gt\"",
    "\"ge\"",
    "\"lt\"",
    "\"le\"",
    "\"<\"",
    "\">\"",
    "\"-\"",
    "\"+\"",
    "\"?\"",
    "\"|\"",
    "\"(\"",
    "\"@\"",
    "\"[\"",
    "\"]\"",
    "\")\"",
    "<Some>",
    "<Every>",
    "<ForVariable>",
    "<CastAs>",
    "<TreatAs>",
    "<ValidateLbrace>",
    "<ValidateContext>",
    "<Digits>",
    "\"comment\"",
    "\"document\"",
    "<DocumentLbrace>",
    "\"text\"",
    "\"untyped\"",
    "\"processing-instruction\"",
    "<NodeLpar>",
    "<CommentLpar>",
    "<TextLpar>",
    "<ProcessingInstructionLpar>",
    "<IfLpar>",
    "\",\"",
    "\".\"",
    "\"..\"",
    "<NCName>",
    "<Prefix>",
    "<LocalPart>",
    "\"$\"",
    "<VarName>",
    "<QName>",
    "<QNameLpar>",
    "\"{\"",
    "\"{\"",
    "\"}\"",
    "<Char>",
    "<WhitespaceChar>",
    "<Letter>",
    "<BaseChar>",
    "<Ideographic>",
    "<CombiningChar>",
    "<Digit>",
    "<Extender>",
  };

}
