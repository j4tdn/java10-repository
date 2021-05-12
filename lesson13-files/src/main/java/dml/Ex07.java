package dml;

public class Ex07 {
	/**
	 *  Ex07: Write, Read XML
		<dependency>
			<groupId>javax.xml.bind</groupId>
			<artifactId>jaxb-api</artifactId>
			<version>2.3.0</version>
		</dependency>
		>> void: writeXml(File file, Object object)
		JAXBContext context = JAXBContext.newInstance(DataType.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(data, file);
		
		@XmlRootElement
		@XmlElement
		@XmlElementWrapper
			@XmlElement
		Reference: https://attacomsian.com/blog/java-read-write-xml#:~:text=nested%20role%20tag.-,Read%20and%20Write%20XML%20with%20JAXB,Java%20Development%20Kit%20(JDK).
	 */
}
