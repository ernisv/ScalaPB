// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor



/** Describes a field within a message.
  *
  * @param type
  *   If type_name is set, this need not be set.  If both this and type_name
  *   are set, this must be one of TYPE_ENUM, TYPE_MESSAGE or TYPE_GROUP.
  * @param typeName
  *   For message and enum types, this is the name of the type.  If the name
  *   starts with a '.', it is fully-qualified.  Otherwise, C++-like scoping
  *   rules are used to find the type (i.e. first the nested types within this
  *   message are searched, then within the parent, on up to the root
  *   namespace).
  * @param extendee
  *   For extensions, this is the name of the type being extended.  It is
  *   resolved in the same manner as type_name.
  * @param defaultValue
  *   For numeric types, contains the original text representation of the value.
  *   For booleans, "true" or "false".
  *   For strings, contains the default text contents (not escaped in any way).
  *   For bytes, contains the C escaped value.  All bytes &gt;= 128 are escaped.
  *   TODO(kenton):  Base-64 encode?
  * @param oneofIndex
  *   If set, gives the index of a oneof in the containing type's oneof_decl
  *   list.  This field is a member of that oneof.
  * @param jsonName
  *   JSON name of this field. The value is set by protocol compiler. If the
  *   user has set a "json_name" option on this field, that option's value
  *   will be used. Otherwise, it's deduced from the field's name by converting
  *   it to camelCase.
  */
@SerialVersionUID(0L)
final case class FieldDescriptorProto(
    name: scala.Option[String] = None,
    number: scala.Option[Int] = None,
    label: scala.Option[com.google.protobuf.descriptor.FieldDescriptorProto.Label] = None,
    `type`: scala.Option[com.google.protobuf.descriptor.FieldDescriptorProto.Type] = None,
    typeName: scala.Option[String] = None,
    extendee: scala.Option[String] = None,
    defaultValue: scala.Option[String] = None,
    oneofIndex: scala.Option[Int] = None,
    jsonName: scala.Option[String] = None,
    options: scala.Option[com.google.protobuf.descriptor.FieldOptions] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[FieldDescriptorProto] with com.trueaccord.lenses.Updatable[FieldDescriptorProto] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (name.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, name.get) }
      if (number.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(3, number.get) }
      if (label.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(4, label.get.value) }
      if (`type`.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(5, `type`.get.value) }
      if (typeName.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, typeName.get) }
      if (extendee.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, extendee.get) }
      if (defaultValue.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(7, defaultValue.get) }
      if (oneofIndex.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(9, oneofIndex.get) }
      if (jsonName.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(10, jsonName.get) }
      if (options.isDefined) { __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(options.get.serializedSize) + options.get.serializedSize }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): Unit = {
      name.foreach { __v =>
        _output__.writeString(1, __v)
      };
      extendee.foreach { __v =>
        _output__.writeString(2, __v)
      };
      number.foreach { __v =>
        _output__.writeInt32(3, __v)
      };
      label.foreach { __v =>
        _output__.writeEnum(4, __v.value)
      };
      `type`.foreach { __v =>
        _output__.writeEnum(5, __v.value)
      };
      typeName.foreach { __v =>
        _output__.writeString(6, __v)
      };
      defaultValue.foreach { __v =>
        _output__.writeString(7, __v)
      };
      options.foreach { __v =>
        _output__.writeTag(8, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
      oneofIndex.foreach { __v =>
        _output__.writeInt32(9, __v)
      };
      jsonName.foreach { __v =>
        _output__.writeString(10, __v)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.FieldDescriptorProto = {
      var __name = this.name
      var __number = this.number
      var __label = this.label
      var __type = this.`type`
      var __typeName = this.typeName
      var __extendee = this.extendee
      var __defaultValue = this.defaultValue
      var __oneofIndex = this.oneofIndex
      var __jsonName = this.jsonName
      var __options = this.options
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = Some(_input__.readString())
          case 24 =>
            __number = Some(_input__.readInt32())
          case 32 =>
            __label = Some(com.google.protobuf.descriptor.FieldDescriptorProto.Label.fromValue(_input__.readEnum()))
          case 40 =>
            __type = Some(com.google.protobuf.descriptor.FieldDescriptorProto.Type.fromValue(_input__.readEnum()))
          case 50 =>
            __typeName = Some(_input__.readString())
          case 18 =>
            __extendee = Some(_input__.readString())
          case 58 =>
            __defaultValue = Some(_input__.readString())
          case 72 =>
            __oneofIndex = Some(_input__.readInt32())
          case 82 =>
            __jsonName = Some(_input__.readString())
          case 66 =>
            __options = Some(_root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, __options.getOrElse(com.google.protobuf.descriptor.FieldOptions.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.FieldDescriptorProto(
          name = __name,
          number = __number,
          label = __label,
          `type` = __type,
          typeName = __typeName,
          extendee = __extendee,
          defaultValue = __defaultValue,
          oneofIndex = __oneofIndex,
          jsonName = __jsonName,
          options = __options
      )
    }
    def getName: String = name.getOrElse("")
    def clearName: FieldDescriptorProto = copy(name = None)
    def withName(__v: String): FieldDescriptorProto = copy(name = Some(__v))
    def getNumber: Int = number.getOrElse(0)
    def clearNumber: FieldDescriptorProto = copy(number = None)
    def withNumber(__v: Int): FieldDescriptorProto = copy(number = Some(__v))
    def getLabel: com.google.protobuf.descriptor.FieldDescriptorProto.Label = label.getOrElse(com.google.protobuf.descriptor.FieldDescriptorProto.Label.LABEL_OPTIONAL)
    def clearLabel: FieldDescriptorProto = copy(label = None)
    def withLabel(__v: com.google.protobuf.descriptor.FieldDescriptorProto.Label): FieldDescriptorProto = copy(label = Some(__v))
    def getType: com.google.protobuf.descriptor.FieldDescriptorProto.Type = `type`.getOrElse(com.google.protobuf.descriptor.FieldDescriptorProto.Type.TYPE_DOUBLE)
    def clearType: FieldDescriptorProto = copy(`type` = None)
    def withType(__v: com.google.protobuf.descriptor.FieldDescriptorProto.Type): FieldDescriptorProto = copy(`type` = Some(__v))
    def getTypeName: String = typeName.getOrElse("")
    def clearTypeName: FieldDescriptorProto = copy(typeName = None)
    def withTypeName(__v: String): FieldDescriptorProto = copy(typeName = Some(__v))
    def getExtendee: String = extendee.getOrElse("")
    def clearExtendee: FieldDescriptorProto = copy(extendee = None)
    def withExtendee(__v: String): FieldDescriptorProto = copy(extendee = Some(__v))
    def getDefaultValue: String = defaultValue.getOrElse("")
    def clearDefaultValue: FieldDescriptorProto = copy(defaultValue = None)
    def withDefaultValue(__v: String): FieldDescriptorProto = copy(defaultValue = Some(__v))
    def getOneofIndex: Int = oneofIndex.getOrElse(0)
    def clearOneofIndex: FieldDescriptorProto = copy(oneofIndex = None)
    def withOneofIndex(__v: Int): FieldDescriptorProto = copy(oneofIndex = Some(__v))
    def getJsonName: String = jsonName.getOrElse("")
    def clearJsonName: FieldDescriptorProto = copy(jsonName = None)
    def withJsonName(__v: String): FieldDescriptorProto = copy(jsonName = Some(__v))
    def getOptions: com.google.protobuf.descriptor.FieldOptions = options.getOrElse(com.google.protobuf.descriptor.FieldOptions.defaultInstance)
    def clearOptions: FieldDescriptorProto = copy(options = None)
    def withOptions(__v: com.google.protobuf.descriptor.FieldOptions): FieldDescriptorProto = copy(options = Some(__v))
    def getField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => name.orNull
        case 3 => number.orNull
        case 4 => label.map(_.valueDescriptor).orNull
        case 5 => `type`.map(_.valueDescriptor).orNull
        case 6 => typeName.orNull
        case 2 => extendee.orNull
        case 7 => defaultValue.orNull
        case 9 => oneofIndex.orNull
        case 10 => jsonName.orNull
        case 8 => options.orNull
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.FieldDescriptorProto
}

object FieldDescriptorProto extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.FieldDescriptorProto] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.FieldDescriptorProto] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.FieldDescriptorProto = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.descriptor.FieldDescriptorProto(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[Int]],
      __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor]].map(__e => com.google.protobuf.descriptor.FieldDescriptorProto.Label.fromValue(__e.getNumber)),
      __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor]].map(__e => com.google.protobuf.descriptor.FieldDescriptorProto.Type.fromValue(__e.getNumber)),
      __fieldsMap.get(__fields.get(4)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(5)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(6)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(7)).asInstanceOf[scala.Option[Int]],
      __fieldsMap.get(__fields.get(8)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(9)).asInstanceOf[scala.Option[com.google.protobuf.descriptor.FieldOptions]]
    )
  }
  def descriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.descriptor.getMessageTypes.get(3)
  def messageCompanionForField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __field.getNumber match {
      case 8 => __out = com.google.protobuf.descriptor.FieldOptions
    }
  __out
  }
  def enumCompanionForField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    __field.getNumber match {
      case 4 => com.google.protobuf.descriptor.FieldDescriptorProto.Label
      case 5 => com.google.protobuf.descriptor.FieldDescriptorProto.Type
    }
  }
  lazy val defaultInstance = com.google.protobuf.descriptor.FieldDescriptorProto(
  )
  sealed trait Type extends _root_.com.trueaccord.scalapb.GeneratedEnum {
    type EnumType = Type
    def isTypeDouble: Boolean = false
    def isTypeFloat: Boolean = false
    def isTypeInt64: Boolean = false
    def isTypeUint64: Boolean = false
    def isTypeInt32: Boolean = false
    def isTypeFixed64: Boolean = false
    def isTypeFixed32: Boolean = false
    def isTypeBool: Boolean = false
    def isTypeString: Boolean = false
    def isTypeGroup: Boolean = false
    def isTypeMessage: Boolean = false
    def isTypeBytes: Boolean = false
    def isTypeUint32: Boolean = false
    def isTypeEnum: Boolean = false
    def isTypeSfixed32: Boolean = false
    def isTypeSfixed64: Boolean = false
    def isTypeSint32: Boolean = false
    def isTypeSint64: Boolean = false
    def isUnrecognized: Boolean = false
    def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Type] = Type
  }
  
  object Type extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Type] {
    implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Type] = this
    @SerialVersionUID(0L)
    case object TYPE_DOUBLE extends Type {
      val value = 1
      val index = 0
      val name = "TYPE_DOUBLE"
      override def isTypeDouble: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_FLOAT extends Type {
      val value = 2
      val index = 1
      val name = "TYPE_FLOAT"
      override def isTypeFloat: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_INT64 extends Type {
      val value = 3
      val index = 2
      val name = "TYPE_INT64"
      override def isTypeInt64: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_UINT64 extends Type {
      val value = 4
      val index = 3
      val name = "TYPE_UINT64"
      override def isTypeUint64: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_INT32 extends Type {
      val value = 5
      val index = 4
      val name = "TYPE_INT32"
      override def isTypeInt32: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_FIXED64 extends Type {
      val value = 6
      val index = 5
      val name = "TYPE_FIXED64"
      override def isTypeFixed64: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_FIXED32 extends Type {
      val value = 7
      val index = 6
      val name = "TYPE_FIXED32"
      override def isTypeFixed32: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_BOOL extends Type {
      val value = 8
      val index = 7
      val name = "TYPE_BOOL"
      override def isTypeBool: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_STRING extends Type {
      val value = 9
      val index = 8
      val name = "TYPE_STRING"
      override def isTypeString: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_GROUP extends Type {
      val value = 10
      val index = 9
      val name = "TYPE_GROUP"
      override def isTypeGroup: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_MESSAGE extends Type {
      val value = 11
      val index = 10
      val name = "TYPE_MESSAGE"
      override def isTypeMessage: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_BYTES extends Type {
      val value = 12
      val index = 11
      val name = "TYPE_BYTES"
      override def isTypeBytes: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_UINT32 extends Type {
      val value = 13
      val index = 12
      val name = "TYPE_UINT32"
      override def isTypeUint32: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_ENUM extends Type {
      val value = 14
      val index = 13
      val name = "TYPE_ENUM"
      override def isTypeEnum: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_SFIXED32 extends Type {
      val value = 15
      val index = 14
      val name = "TYPE_SFIXED32"
      override def isTypeSfixed32: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_SFIXED64 extends Type {
      val value = 16
      val index = 15
      val name = "TYPE_SFIXED64"
      override def isTypeSfixed64: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_SINT32 extends Type {
      val value = 17
      val index = 16
      val name = "TYPE_SINT32"
      override def isTypeSint32: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object TYPE_SINT64 extends Type {
      val value = 18
      val index = 17
      val name = "TYPE_SINT64"
      override def isTypeSint64: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case class Unrecognized(value: Int) extends Type {
      val name = "UNRECOGNIZED"
      val index = -1
      override def isUnrecognized: Boolean = true
    }
    
    lazy val values = scala.collection.Seq(TYPE_DOUBLE, TYPE_FLOAT, TYPE_INT64, TYPE_UINT64, TYPE_INT32, TYPE_FIXED64, TYPE_FIXED32, TYPE_BOOL, TYPE_STRING, TYPE_GROUP, TYPE_MESSAGE, TYPE_BYTES, TYPE_UINT32, TYPE_ENUM, TYPE_SFIXED32, TYPE_SFIXED64, TYPE_SINT32, TYPE_SINT64)
    def fromValue(value: Int): Type = value match {
      case 1 => TYPE_DOUBLE
      case 2 => TYPE_FLOAT
      case 3 => TYPE_INT64
      case 4 => TYPE_UINT64
      case 5 => TYPE_INT32
      case 6 => TYPE_FIXED64
      case 7 => TYPE_FIXED32
      case 8 => TYPE_BOOL
      case 9 => TYPE_STRING
      case 10 => TYPE_GROUP
      case 11 => TYPE_MESSAGE
      case 12 => TYPE_BYTES
      case 13 => TYPE_UINT32
      case 14 => TYPE_ENUM
      case 15 => TYPE_SFIXED32
      case 16 => TYPE_SFIXED64
      case 17 => TYPE_SINT32
      case 18 => TYPE_SINT64
      case __other => Unrecognized(__other)
    }
    def descriptor: com.google.protobuf.Descriptors.EnumDescriptor = com.google.protobuf.descriptor.FieldDescriptorProto.descriptor.getEnumTypes.get(0)
  }
  sealed trait Label extends _root_.com.trueaccord.scalapb.GeneratedEnum {
    type EnumType = Label
    def isLabelOptional: Boolean = false
    def isLabelRequired: Boolean = false
    def isLabelRepeated: Boolean = false
    def isUnrecognized: Boolean = false
    def companion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Label] = Label
  }
  
  object Label extends _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Label] {
    implicit def enumCompanion: _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[Label] = this
    @SerialVersionUID(0L)
    case object LABEL_OPTIONAL extends Label {
      val value = 1
      val index = 0
      val name = "LABEL_OPTIONAL"
      override def isLabelOptional: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object LABEL_REQUIRED extends Label {
      val value = 2
      val index = 1
      val name = "LABEL_REQUIRED"
      override def isLabelRequired: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object LABEL_REPEATED extends Label {
      val value = 3
      val index = 2
      val name = "LABEL_REPEATED"
      override def isLabelRepeated: Boolean = true
    }
    
    @SerialVersionUID(0L)
    case class Unrecognized(value: Int) extends Label {
      val name = "UNRECOGNIZED"
      val index = -1
      override def isUnrecognized: Boolean = true
    }
    
    lazy val values = scala.collection.Seq(LABEL_OPTIONAL, LABEL_REQUIRED, LABEL_REPEATED)
    def fromValue(value: Int): Label = value match {
      case 1 => LABEL_OPTIONAL
      case 2 => LABEL_REQUIRED
      case 3 => LABEL_REPEATED
      case __other => Unrecognized(__other)
    }
    def descriptor: com.google.protobuf.Descriptors.EnumDescriptor = com.google.protobuf.descriptor.FieldDescriptorProto.descriptor.getEnumTypes.get(1)
  }
  implicit class FieldDescriptorProtoLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FieldDescriptorProto]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.FieldDescriptorProto](_l) {
    def name: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getName)((c_, f_) => c_.copy(name = Some(f_)))
    def optionalName: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def number: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getNumber)((c_, f_) => c_.copy(number = Some(f_)))
    def optionalNumber: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.number)((c_, f_) => c_.copy(number = f_))
    def label: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FieldDescriptorProto.Label] = field(_.getLabel)((c_, f_) => c_.copy(label = Some(f_)))
    def optionalLabel: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.descriptor.FieldDescriptorProto.Label]] = field(_.label)((c_, f_) => c_.copy(label = f_))
    def `type`: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FieldDescriptorProto.Type] = field(_.getType)((c_, f_) => c_.copy(`type` = Some(f_)))
    def optionalType: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.descriptor.FieldDescriptorProto.Type]] = field(_.`type`)((c_, f_) => c_.copy(`type` = f_))
    def typeName: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getTypeName)((c_, f_) => c_.copy(typeName = Some(f_)))
    def optionalTypeName: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.typeName)((c_, f_) => c_.copy(typeName = f_))
    def extendee: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getExtendee)((c_, f_) => c_.copy(extendee = Some(f_)))
    def optionalExtendee: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.extendee)((c_, f_) => c_.copy(extendee = f_))
    def defaultValue: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getDefaultValue)((c_, f_) => c_.copy(defaultValue = Some(f_)))
    def optionalDefaultValue: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.defaultValue)((c_, f_) => c_.copy(defaultValue = f_))
    def oneofIndex: _root_.com.trueaccord.lenses.Lens[UpperPB, Int] = field(_.getOneofIndex)((c_, f_) => c_.copy(oneofIndex = Some(f_)))
    def optionalOneofIndex: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[Int]] = field(_.oneofIndex)((c_, f_) => c_.copy(oneofIndex = f_))
    def jsonName: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getJsonName)((c_, f_) => c_.copy(jsonName = Some(f_)))
    def optionalJsonName: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.jsonName)((c_, f_) => c_.copy(jsonName = f_))
    def options: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.FieldOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = Some(f_)))
    def optionalOptions: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.descriptor.FieldOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val NUMBER_FIELD_NUMBER = 3
  final val LABEL_FIELD_NUMBER = 4
  final val TYPE_FIELD_NUMBER = 5
  final val TYPE_NAME_FIELD_NUMBER = 6
  final val EXTENDEE_FIELD_NUMBER = 2
  final val DEFAULT_VALUE_FIELD_NUMBER = 7
  final val ONEOF_INDEX_FIELD_NUMBER = 9
  final val JSON_NAME_FIELD_NUMBER = 10
  final val OPTIONS_FIELD_NUMBER = 8
}
