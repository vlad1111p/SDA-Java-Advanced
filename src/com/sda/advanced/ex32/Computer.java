package com.sda.advanced.ex32;

import java.io.Serializable;
import java.util.Objects;

public class Computer implements Serializable {
    private String processor;
    private String ram;
    private String graphicsCard;
    private String company;
    private String model;

    public Computer(String processor, String ram, String graphicsCard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public Computer setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public String getRam() {
        return ram;
    }

    public Computer setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public Computer setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public Computer setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Computer setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(
                processor, computer.processor)
                && Objects.equals(ram, computer.ram)
                && Objects.equals(graphicsCard, computer.graphicsCard)
                && Objects.equals(company, computer.company)
                && Objects.equals(model, computer.model
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicsCard, company, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}