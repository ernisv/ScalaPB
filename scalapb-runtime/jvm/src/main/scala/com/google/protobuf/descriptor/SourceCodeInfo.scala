// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

import scala.collection.JavaConverters._

/** Encapsulates information about the original source file from which a
  * FileDescriptorProto was generated.
  *
  * @param location
  *   A Location identifies a piece of source code in a .proto file which
  *   corresponds to a particular definition.  This information is intended
  *   to be useful to IDEs, code indexers, documentation generators, and similar
  *   tools.
  *  
  *   For example, say we have a file like:
  *     message Foo {
  *       optional string foo = 1;
  *     }
  *   Let's look at just the field definition:
  *     optional string foo = 1;
  *     ^       ^^     ^^  ^  ^^^
  *     a       bc     de  f  ghi
  *   We have the following locations:
  *     span   path               represents
  *     [a,i)  [ 4, 0, 2, 0 ]     The whole field definition.
  *     [a,b)  [ 4, 0, 2, 0, 4 ]  The label (optional).
  *     [c,d)  [ 4, 0, 2, 0, 5 ]  The type (string).
  *     [e,f)  [ 4, 0, 2, 0, 1 ]  The name (foo).
  *     [g,h)  [ 4, 0, 2, 0, 3 ]  The number (1).
  *  
  *   Notes:
  *   - A location may refer to a repeated field itself (i.e. not to any
  *     particular index within it).  This is used whenever a set of elements are
  *     logically enclosed in a single code segment.  For example, an entire
  *     extend block (possibly containing multiple extension definitions) will
  *     have an outer location whose path refers to the "extensions" repeated
  *     field without an index.
  *   - Multiple locations may have the same path.  This happens when a single
  *     logical declaration is spread out across multiple places.  The most
  *     obvious example is the "extend" block again -- there may be multiple
  *     extend blocks in the same scope, each of which will have the same path.
  *   - A location's span is not always a subset of its parent's span.  For
  *     example, the "extendee" of an extension declaration appears at the
  *     beginning of the "extend" block and is shared by all extensions within
  *     the block.
  *   - Just because a location's span is a subset of some other location's span
  *     does not mean that it is a descendent.  For example, a "group" defines
  *     both a type and a field in a single declaration.  Thus, the locations
  *     corresponding to the type and field and their components will overlap.
  *   - Code which tries to interpret locations should probably be designed to
  *     ignore those that it doesn't understand, as more types of locations could
  *     be recorded in the future.
  */
@SerialVersionUID(0L)
final case class SourceCodeInfo(
    location: scala.collection.Seq[com.google.protobuf.descriptor.SourceCodeInfo.Location] = Nil
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[SourceCodeInfo] with com.trueaccord.lenses.Updatable[SourceCodeInfo] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      location.foreach(location => __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(location.serializedSize) + location.serializedSize)
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
      location.foreach { __v =>
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.SourceCodeInfo = {
      val __location = (scala.collection.immutable.Vector.newBuilder[com.google.protobuf.descriptor.SourceCodeInfo.Location] ++= this.location)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __location += _root_.com.trueaccord.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.descriptor.SourceCodeInfo.Location.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.SourceCodeInfo(
          location = __location.result()
      )
    }
    def clearLocation = copy(location = scala.collection.Seq.empty)
    def addLocation(__vs: com.google.protobuf.descriptor.SourceCodeInfo.Location*): SourceCodeInfo = addAllLocation(__vs)
    def addAllLocation(__vs: TraversableOnce[com.google.protobuf.descriptor.SourceCodeInfo.Location]): SourceCodeInfo = copy(location = location ++ __vs)
    def withLocation(__v: scala.collection.Seq[com.google.protobuf.descriptor.SourceCodeInfo.Location]): SourceCodeInfo = copy(location = __v)
    def getField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => location
      }
    }
    override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.SourceCodeInfo
}

object SourceCodeInfo extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.SourceCodeInfo] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.SourceCodeInfo, com.google.protobuf.DescriptorProtos.SourceCodeInfo] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.SourceCodeInfo] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.SourceCodeInfo, com.google.protobuf.DescriptorProtos.SourceCodeInfo] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.SourceCodeInfo): com.google.protobuf.DescriptorProtos.SourceCodeInfo = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.SourceCodeInfo.newBuilder
    javaPbOut.addAllLocation(scalaPbSource.location.map(com.google.protobuf.descriptor.SourceCodeInfo.Location.toJavaProto(_)).asJava)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.SourceCodeInfo): com.google.protobuf.descriptor.SourceCodeInfo = com.google.protobuf.descriptor.SourceCodeInfo(
    location = javaPbSource.getLocationList.asScala.map(com.google.protobuf.descriptor.SourceCodeInfo.Location.fromJavaProto(_))
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.SourceCodeInfo = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.descriptor.SourceCodeInfo(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[scala.collection.Seq[com.google.protobuf.descriptor.SourceCodeInfo.Location]]
    )
  }
  def descriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.descriptor.getMessageTypes.get(18)
  def messageCompanionForField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    var __out: _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __field.getNumber match {
      case 1 => __out = com.google.protobuf.descriptor.SourceCodeInfo.Location
    }
  __out
  }
  def enumCompanionForField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.descriptor.SourceCodeInfo(
  )
  /** @param path
    *   Identifies which part of the FileDescriptorProto was defined at this
    *   location.
    *  
    *   Each element is a field number or an index.  They form a path from
    *   the root FileDescriptorProto to the place where the definition.  For
    *   example, this path:
    *     [ 4, 3, 2, 7, 1 ]
    *   refers to:
    *     file.message_type(3)  // 4, 3
    *         .field(7)         // 2, 7
    *         .name()           // 1
    *   This is because FileDescriptorProto.message_type has field number 4:
    *     repeated DescriptorProto message_type = 4;
    *   and DescriptorProto.field has field number 2:
    *     repeated FieldDescriptorProto field = 2;
    *   and FieldDescriptorProto.name has field number 1:
    *     optional string name = 1;
    *  
    *   Thus, the above path gives the location of a field name.  If we removed
    *   the last element:
    *     [ 4, 3, 2, 7 ]
    *   this path refers to the whole field declaration (from the beginning
    *   of the label to the terminating semicolon).
    * @param span
    *   Always has exactly three or four elements: start line, start column,
    *   end line (optional, otherwise assumed same as start line), end column.
    *   These are packed into a single field for efficiency.  Note that line
    *   and column numbers are zero-based -- typically you will want to add
    *   1 to each before displaying to a user.
    * @param leadingComments
    *   If this SourceCodeInfo represents a complete declaration, these are any
    *   comments appearing before and after the declaration which appear to be
    *   attached to the declaration.
    *  
    *   A series of line comments appearing on consecutive lines, with no other
    *   tokens appearing on those lines, will be treated as a single comment.
    *  
    *   leading_detached_comments will keep paragraphs of comments that appear
    *   before (but not connected to) the current element. Each paragraph,
    *   separated by empty lines, will be one comment element in the repeated
    *   field.
    *  
    *   Only the comment content is provided; comment markers (e.g. //) are
    *   stripped out.  For block comments, leading whitespace and an asterisk
    *   will be stripped from the beginning of each line other than the first.
    *   Newlines are included in the output.
    *  
    *   Examples:
    *  
    *     optional int32 foo = 1;  // Comment attached to foo.
    *     // Comment attached to bar.
    *     optional int32 bar = 2;
    *  
    *     optional string baz = 3;
    *     // Comment attached to baz.
    *     // Another line attached to baz.
    *  
    *     // Comment attached to qux.
    *     //
    *     // Another line attached to qux.
    *     optional double qux = 4;
    *  
    *     // Detached comment for corge. This is not leading or trailing comments
    *     // to qux or corge because there are blank lines separating it from
    *     // both.
    *  
    *     // Detached comment for corge paragraph 2.
    *  
    *     optional string corge = 5;
    *     /&#42; Block comment attached
    *      * to corge.  Leading asterisks
    *      * will be removed. *&#47;
    *     /&#42; Block comment attached to
    *      * grault. *&#47;
    *     optional int32 grault = 6;
    *  
    *     // ignored detached comments.
    */
  @SerialVersionUID(0L)
  final case class Location(
      path: scala.collection.Seq[Int] = Nil,
      span: scala.collection.Seq[Int] = Nil,
      leadingComments: scala.Option[String] = None,
      trailingComments: scala.Option[String] = None,
      leadingDetachedComments: scala.collection.Seq[String] = Nil
      ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[Location] with com.trueaccord.lenses.Updatable[Location] {
      private[this] def pathSerializedSize = {
      if (__pathSerializedSizeField == 0) __pathSerializedSizeField = 
        path.map(_root_.com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag).sum
      __pathSerializedSizeField
      }
      @transient private[this] var __pathSerializedSizeField: Int = 0
      private[this] def spanSerializedSize = {
      if (__spanSerializedSizeField == 0) __spanSerializedSizeField = 
        span.map(_root_.com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag).sum
      __spanSerializedSizeField
      }
      @transient private[this] var __spanSerializedSizeField: Int = 0
      @transient
      private[this] var __serializedSizeCachedValue: Int = 0
      private[this] def __computeSerializedValue(): Int = {
        var __size = 0
        if(path.nonEmpty) {
          val __localsize = pathSerializedSize
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__localsize) + __localsize
        }
        if(span.nonEmpty) {
          val __localsize = spanSerializedSize
          __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__localsize) + __localsize
        }
        if (leadingComments.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, leadingComments.get) }
        if (trailingComments.isDefined) { __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, trailingComments.get) }
        leadingDetachedComments.foreach(leadingDetachedComments => __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, leadingDetachedComments))
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
        if (path.nonEmpty) {
          _output__.writeTag(1, 2)
          _output__.writeUInt32NoTag(pathSerializedSize)
          path.foreach(_output__.writeInt32NoTag)
        };
        if (span.nonEmpty) {
          _output__.writeTag(2, 2)
          _output__.writeUInt32NoTag(spanSerializedSize)
          span.foreach(_output__.writeInt32NoTag)
        };
        leadingComments.foreach { __v =>
          _output__.writeString(3, __v)
        };
        trailingComments.foreach { __v =>
          _output__.writeString(4, __v)
        };
        leadingDetachedComments.foreach { __v =>
          _output__.writeString(6, __v)
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.SourceCodeInfo.Location = {
        val __path = (scala.collection.immutable.Vector.newBuilder[Int] ++= this.path)
        val __span = (scala.collection.immutable.Vector.newBuilder[Int] ++= this.span)
        var __leadingComments = this.leadingComments
        var __trailingComments = this.trailingComments
        val __leadingDetachedComments = (scala.collection.immutable.Vector.newBuilder[String] ++= this.leadingDetachedComments)
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 8 =>
              __path += _input__.readInt32()
            case 10 => {
              val length = _input__.readRawVarint32()
              val oldLimit = _input__.pushLimit(length)
              while (_input__.getBytesUntilLimit > 0) {
                __path += _input__.readInt32
              }
              _input__.popLimit(oldLimit)
            }
            case 16 =>
              __span += _input__.readInt32()
            case 18 => {
              val length = _input__.readRawVarint32()
              val oldLimit = _input__.pushLimit(length)
              while (_input__.getBytesUntilLimit > 0) {
                __span += _input__.readInt32
              }
              _input__.popLimit(oldLimit)
            }
            case 26 =>
              __leadingComments = Some(_input__.readString())
            case 34 =>
              __trailingComments = Some(_input__.readString())
            case 50 =>
              __leadingDetachedComments += _input__.readString()
            case tag => _input__.skipField(tag)
          }
        }
        com.google.protobuf.descriptor.SourceCodeInfo.Location(
            path = __path.result(),
            span = __span.result(),
            leadingComments = __leadingComments,
            trailingComments = __trailingComments,
            leadingDetachedComments = __leadingDetachedComments.result()
        )
      }
      def clearPath = copy(path = scala.collection.Seq.empty)
      def addPath(__vs: Int*): Location = addAllPath(__vs)
      def addAllPath(__vs: TraversableOnce[Int]): Location = copy(path = path ++ __vs)
      def withPath(__v: scala.collection.Seq[Int]): Location = copy(path = __v)
      def clearSpan = copy(span = scala.collection.Seq.empty)
      def addSpan(__vs: Int*): Location = addAllSpan(__vs)
      def addAllSpan(__vs: TraversableOnce[Int]): Location = copy(span = span ++ __vs)
      def withSpan(__v: scala.collection.Seq[Int]): Location = copy(span = __v)
      def getLeadingComments: String = leadingComments.getOrElse("")
      def clearLeadingComments: Location = copy(leadingComments = None)
      def withLeadingComments(__v: String): Location = copy(leadingComments = Some(__v))
      def getTrailingComments: String = trailingComments.getOrElse("")
      def clearTrailingComments: Location = copy(trailingComments = None)
      def withTrailingComments(__v: String): Location = copy(trailingComments = Some(__v))
      def clearLeadingDetachedComments = copy(leadingDetachedComments = scala.collection.Seq.empty)
      def addLeadingDetachedComments(__vs: String*): Location = addAllLeadingDetachedComments(__vs)
      def addAllLeadingDetachedComments(__vs: TraversableOnce[String]): Location = copy(leadingDetachedComments = leadingDetachedComments ++ __vs)
      def withLeadingDetachedComments(__v: scala.collection.Seq[String]): Location = copy(leadingDetachedComments = __v)
      def getField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
        __field.getNumber match {
          case 1 => path
          case 2 => span
          case 3 => leadingComments.orNull
          case 4 => trailingComments.orNull
          case 6 => leadingDetachedComments
        }
      }
      override def toString: String = _root_.com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.google.protobuf.descriptor.SourceCodeInfo.Location
  }
  
  object Location extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.SourceCodeInfo.Location] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.SourceCodeInfo.Location, com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location] {
    implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.SourceCodeInfo.Location] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.SourceCodeInfo.Location, com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location] = this
    def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.SourceCodeInfo.Location): com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location = {
      val javaPbOut = com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location.newBuilder
      javaPbOut.addAllPath(scalaPbSource.path.map(Int.box(_)).asJava)
      javaPbOut.addAllSpan(scalaPbSource.span.map(Int.box(_)).asJava)
      scalaPbSource.leadingComments.foreach(javaPbOut.setLeadingComments)
      scalaPbSource.trailingComments.foreach(javaPbOut.setTrailingComments)
      javaPbOut.addAllLeadingDetachedComments(scalaPbSource.leadingDetachedComments.asJava)
      javaPbOut.build
    }
    def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.SourceCodeInfo.Location): com.google.protobuf.descriptor.SourceCodeInfo.Location = com.google.protobuf.descriptor.SourceCodeInfo.Location(
      path = javaPbSource.getPathList.asScala.map(_.intValue),
      span = javaPbSource.getSpanList.asScala.map(_.intValue),
      leadingComments = if (javaPbSource.hasLeadingComments) Some(javaPbSource.getLeadingComments) else None,
      trailingComments = if (javaPbSource.hasTrailingComments) Some(javaPbSource.getTrailingComments) else None,
      leadingDetachedComments = javaPbSource.getLeadingDetachedCommentsList.asScala
    )
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.SourceCodeInfo.Location = {
      require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
      val __fields = descriptor.getFields
      com.google.protobuf.descriptor.SourceCodeInfo.Location(
        __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[scala.collection.Seq[Int]],
        __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[scala.collection.Seq[Int]],
        __fieldsMap.get(__fields.get(2)).asInstanceOf[scala.Option[String]],
        __fieldsMap.get(__fields.get(3)).asInstanceOf[scala.Option[String]],
        __fieldsMap.getOrElse(__fields.get(4), Nil).asInstanceOf[scala.collection.Seq[String]]
      )
    }
    def descriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.protobuf.descriptor.SourceCodeInfo.descriptor.getNestedTypes.get(0)
    def messageCompanionForField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): _root_.com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
    def enumCompanionForField(__field: _root_.com.google.protobuf.Descriptors.FieldDescriptor): _root_.com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
    lazy val defaultInstance = com.google.protobuf.descriptor.SourceCodeInfo.Location(
    )
    implicit class LocationLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.SourceCodeInfo.Location]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.SourceCodeInfo.Location](_l) {
      def path: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[Int]] = field(_.path)((c_, f_) => c_.copy(path = f_))
      def span: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[Int]] = field(_.span)((c_, f_) => c_.copy(span = f_))
      def leadingComments: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getLeadingComments)((c_, f_) => c_.copy(leadingComments = Some(f_)))
      def optionalLeadingComments: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.leadingComments)((c_, f_) => c_.copy(leadingComments = f_))
      def trailingComments: _root_.com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getTrailingComments)((c_, f_) => c_.copy(trailingComments = Some(f_)))
      def optionalTrailingComments: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.trailingComments)((c_, f_) => c_.copy(trailingComments = f_))
      def leadingDetachedComments: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[String]] = field(_.leadingDetachedComments)((c_, f_) => c_.copy(leadingDetachedComments = f_))
    }
    final val PATH_FIELD_NUMBER = 1
    final val SPAN_FIELD_NUMBER = 2
    final val LEADING_COMMENTS_FIELD_NUMBER = 3
    final val TRAILING_COMMENTS_FIELD_NUMBER = 4
    final val LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6
  }
  
  implicit class SourceCodeInfoLens[UpperPB](_l: _root_.com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.SourceCodeInfo]) extends _root_.com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.SourceCodeInfo](_l) {
    def location: _root_.com.trueaccord.lenses.Lens[UpperPB, scala.collection.Seq[com.google.protobuf.descriptor.SourceCodeInfo.Location]] = field(_.location)((c_, f_) => c_.copy(location = f_))
  }
  final val LOCATION_FIELD_NUMBER = 1
}
