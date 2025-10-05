import React from 'react';

const ServiceBox = ({ title, description, link }) => {
  return (
    <div className="service-box">
      <h3>{title}</h3>
      <p>{description}</p>
      <a href={link}>Read More</a>
    </div>
  );
};

export default ServiceBox;