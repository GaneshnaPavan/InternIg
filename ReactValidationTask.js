import React, { useState } from "react"

const FormValidation = () => {
    const [formData, setFormdata] = useState({
        name: "",
        email: "",
        password: "",
        gender: "",
        mobile: "",
        DOB: "",
        creditcardNo: ""
    });
    const [errors, setErrors] = useState({});

    const validate = () => {
        let tempErrors = {};
        if (!formData.name)
            tempErrors.name = "name is required";
        if (!formData.email) {
            tempErrors.email = "Email is required";
        } else if (!/\S+@\S+\.\S+/.test(formData.email)) {
            tempErrors.email = "not valid email"
        }
        if (!formData.password) {
            tempErrors.password = "password is required";
        } else if (formData.password.length < 6) {
            tempErrors.password = "Password must have 6 or more";
        }
        if (!formData.DOB) {
            tempErrors.DOB = "DOB is required";
        } else if (!/^(0[1-9]|[12][0-9]|3[01])\/(0[1-9]|1[0-2])\/\d{4}$/.test(formData.DOB)) {
            tempErrors.DOB = "Invalid date"
        }
        if (!formData.gender)
            tempErrors.gender = "gender is required";
        if (!formData.mobile) {
            tempErrors.mobile = "Mobile number necessary";
        } else if (formData.mobile.length < 10) {
            tempErrors.mobile = "Minimum 10 digits";
        }
        if (!formData.creditcardNo) {
            tempErrors.creditcardNo = "Credit card number necessary";
        } else if (formData.creditcardNo.length < 16) {
            tempErrors.creditcardNo = "Minimum 16 digits";
        }
        setErrors(tempErrors);
        return Object.keys(tempErrors).length === 0;
    };


    const handleChange = (e) => {
        setFormdata({ ...formData, [e.target.name]: e.target.value });
    }

    const handleSubmit = (e) => {
        e.preventDefault();
        if (validate()) {
            alert("Form submitted succesfully");
            console.log(formData)

        }
    };
    return (
        <>

            <h2>React form validation</h2>
            <form onSubmit={handleSubmit}>
                <label>Name: </label>
                <input type="text" name="name" value={formData.name} onChange={handleChange} /><br />
                {errors.name && <p style={{ color: "red" }}>{errors.name}</p>}
                <label>Email: </label>
                <input type="email" name="email" value={formData.email} onChange={handleChange} /><br />
                {errors.email && <p style={{ color: "red" }}>{errors.email}</p>}
                <label>Password: </label>

                <input type="password" name="password" value={formData.password} onChange={handleChange} /><br />
                {errors.password && <p style={{ color: "red" }}>{errors.password}</p>}
                <label>DOB: </label>

                <input type="text" name="DOB" value={formData.DOB} onChange={handleChange} /><br />
                {errors.DOB && <p style={{ color: "red" }}>{errors.DOB}</p>}
                <label>Mobile: </label>

                <input type="text" name="mobile" value={formData.mobile} onChange={handleChange} /><br />
                {errors.mobile && <p style={{ color: "red" }}>{errors.mobile}</p>}
                <label>Gender: </label>
                <input type="text" name="gender" value={formData.gender} onChange={handleChange} /><br />
                {errors.gender && <p style={{ color: "red" }}>{errors.gender}</p>}
                <label>CreditNo: </label>
                <input type="text" name="creditcardNo" value={formData.creditcardNo} onChange={handleChange} /><br />
                {errors.creditcardNo && <p style={{ color: "red" }}>{errors.creditcardNo}</p>}
                <button type="submit">Submit</button>

            </form>


        </>
    );


};
export default FormValidation;