import './App.css';
import { Navbar, Container, Pagination } from 'react-bootstrap';
import React from 'react';
import MainTable from './main-table/MainTable';
import LoadingSpinner from './common/Spinner';
import { httpGet } from './utils/http';

class App extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {
            productPagable: {
                content: []
            }
        };
    }

    async getProducts(pageIndex)
    {
        this.setState({
            productsLoading: true,
            productPagable: {
                content: [],
                totalPages: this.state.productPagable.totalPages,
            }
        });

        const productPagable = await httpGet(`http://localhost:8080/api/v1/product/get-all?page=${pageIndex}&size=15`);
        productPagable.content.forEach((product) =>
        {
            product.sellStartDate = product.sellStartDate && new Date(product.sellStartDate);
            product.sellEndDate = product.sellEndDate && new Date(product.sellEndDate);
        });
        console.log(productPagable);

        this.setState({
            productPagable: productPagable,
            currentPage: pageIndex,
            productsLoading: false,
        });
    }

    async componentDidMount()
    {
        await this.getProducts(0);
    }

    selectPage(index)
    {
        this.getProducts(index);
    }

    render()
    {
        const pagable = this.state.productPagable;
        return (
            <div className="App">
                <Navbar bg="light" expand="lg">
                    <Container>
                        <Navbar.Brand>ReactJS Adventure Works</Navbar.Brand>
                    </Container>
                </Navbar>

                <Container>
                    <h1> Products </h1>
                    <Pagination>
                        <Pagination.First
                            disabled={this.state.productsLoading || this.state.currentPage === 0}
                            onClick={() => this.selectPage(0)} />
                        <Pagination.Prev
                            disabled={this.state.productsLoading || this.state.currentPage === 0}
                            onClick={() => this.selectPage(Math.max(0, this.state.currentPage - 1))} />
                        {[...Array(pagable.totalPages)].map((_, index) => (
                            <Pagination.Item
                                disabled={this.state.productsLoading} active={this.state.currentPage === index}
                                onClick={() => this.selectPage(index)}>{index + 1}</Pagination.Item>
                        ))}
                        <Pagination.Next
                            disabled={this.state.productsLoading || this.state.currentPage === pagable.totalPages - 1}
                            onClick={() => this.selectPage(Math.min(pagable.totalPages - 1, this.state.currentPage + 1))} />
                        <Pagination.Last
                            disabled={this.state.productsLoading || this.state.currentPage === pagable.totalPages - 1}
                            onClick={() => this.selectPage(pagable.totalPages - 1)} />
                    </Pagination>
                    <MainTable products={pagable.content}></MainTable>
                </Container>
            </div>
        )
    };
}

export default App;
