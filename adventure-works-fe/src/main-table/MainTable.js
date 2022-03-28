import { Table, Spinner } from 'react-bootstrap';
import React from 'react';

class MainTable extends React.Component
{
    // constructor(props)
    // {
    //     super(props);
    // }

    render()
    {
        return (
            <div>
                <Table striped bordered hover>
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Code</th>
                            <th>Name</th>
                            <th>Color</th>
                            <th>cost</th>
                            <th>Sell start date</th>
                            <th>Sell end date</th>
                        </tr>
                    </thead>
                    <tbody>
                        {this.props.products.length > 0
                            ? (this.props.products.map((product, index) => (
                                <tr key={product.productId}>
                                    <td>{index + 1}</td>
                                    <td>{product.productCode}</td>
                                    <td>{product.productName}</td>
                                    <td>{product.color}</td>
                                    <td className="text-end">{'$' + Math.round(product.cost * 100) / 100}</td>
                                    <td>{product.sellStartDate?.toDateString()}</td>
                                    <td>{product.sellEndDate?.toDateString()}</td>
                                </tr>
                            )))
                            : (<tr>
                                <td colSpan={7} className="text-center">
                                    <Spinner animation="border" role="status">
                                        <span className="visually-hidden">Loading...</span>
                                    </Spinner>
                                </td>
                            </tr>)
                        }
                    </tbody>
                </Table>
            </div>
        );
    }
}

export default MainTable;
