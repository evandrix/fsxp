
package collada;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="fx_code_profile", propOrder={"value"})
public class FxCodeProfile
{
  @XmlValue
  protected String value;
  @XmlAttribute
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String sid;
  public String getValue()
  {
    return this.value;
  }
  public void setValue(String value)
  {
    this.value = value;
  }
  public String getSid()
  {
    return this.sid;
  }
  public void setSid(String value)
  {
    this.sid = value;
  }
}

