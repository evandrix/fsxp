
package collada;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="cg_setuser_type", propOrder={"boolOrBool1OrBool2", "setparam"})
public class CgSetuserType
{
  @XmlElementRefs({@javax.xml.bind.annotation.XmlElementRef(name="half4x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="samplerRECT", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed2x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed1x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed3x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool2x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half1x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool3x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool3x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float1x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float1x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float2x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int2x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float3x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="surface", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed3x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int4x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half4x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float4x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="array", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float4x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int1x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed2x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="sampler3D", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float4x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="samplerDEPTH", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int1x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool3x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="usertype", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool2x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half1x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float1x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half3x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int1x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed2x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed3x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int3x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed2x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int4x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float3x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half2x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed4x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float2x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed3x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half2x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool4x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int3x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool4x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half4x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool4x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool2x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int4x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half3x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool1x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float3x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed1x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed1x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float2x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed4x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half3x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half4x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool4x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int2x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed4x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float2x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool1x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float4x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int4x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int2x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool1x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool1x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="samplerCUBE", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half2x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="connect_param", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed4x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="sampler1D", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half1x2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="string", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float3x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half3x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="enum", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="float1x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int1x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="sampler2D", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half2", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half2x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool2x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="bool3x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="half1x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int2x3", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int3x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="fixed1x1", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class), @javax.xml.bind.annotation.XmlElementRef(name="int3x4", namespace="http://www.collada.org/2005/11/COLLADASchema", type=JAXBElement.class)})
  protected List<JAXBElement<?>> boolOrBool1OrBool2;
  protected List<CgSetparam> setparam;
  @XmlAttribute(required=true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String name;
  @XmlAttribute(required=true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String source;
  public List<JAXBElement<?>> getBoolOrBool1OrBool2()
  {
    if (this.boolOrBool1OrBool2 == null)
      this.boolOrBool1OrBool2 = new ArrayList();
    return this.boolOrBool1OrBool2;
  }
  public List<CgSetparam> getSetparam()
  {
    if (this.setparam == null)
      this.setparam = new ArrayList();
    return this.setparam;
  }
  public String getName()
  {
    return this.name;
  }
  public void setName(String value)
  {
    this.name = value;
  }
  public String getSource()
  {
    return this.source;
  }
  public void setSource(String value)
  {
    this.source = value;
  }
}

