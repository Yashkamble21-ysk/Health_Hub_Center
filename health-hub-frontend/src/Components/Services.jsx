import React from 'react';
import ServiceBox from './ServiceBox';

const Services = () => {
  const services = [
    {
      title: "Doctor Timetable",
      description: "Providing Sai Clinic Doctor Time Table.",
      link: "DoctorTimeTable.html"
    },
    {
      title: "Health Information",
      description: "Providing Health Information For You.",
      link: "HealthInformation.html"
    },
    {
      title: "Emergency Care",
      description: "24/7 Emergency Services With Advanced Medical Equipment.",
      link: "EmergencyCare.html"
    },
    {
      title: "Emergency Appointment",
      description: "Schedule An Appointment Online Available.",
      link: "E-Appointment.html"
    },
    {
      title: "Locations",
      description: "Find Care In An Area Convenient To You.",
      link: "#"
    }
  ];

  return (
    <div className="footer">
      <section className="services">
        {services.map((service, index) => (
          <ServiceBox
            key={index}
            title={service.title}
            description={service.description}
            link={service.link}
          />
        ))}
      </section>
    </div>
  );
};

export default Services;