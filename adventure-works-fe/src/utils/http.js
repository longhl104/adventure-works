function httpGet(url)
{
    return fetch(url)
        .then(res => res.json());
}

export { httpGet };